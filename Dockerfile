FROM node:22.13-alpine
WORKDIR /app
COPY package*.json ./
RUN ["npm", "install"]
COPY . ./
EXPOSE 3000
RUN ["npm", "run", "build"]
CMD ["npx", "serve", "-s", "dist"]

