const config = require('./scalajs.webpack.config')
const path = require('path')
const projectRoot = '../'

const HtmlWebpackPlugin = require('html-webpack-plugin')

config.plugins = [
    new HtmlWebpackPlugin({
        template: path.resolve(projectRoot, './index.html'),
        filename: 'index.html',
    })
]
config.module = {
    rules:[{
        test: /\.js$/,
        use: ["scalajs-friendly-source-map-loader"],
    }]
}
module.exports = config
