//
//  ContentView.swift
//  Shared
//
//  Created by Harsimran Singh on 11/21/21.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        HStack{
            Image("Remix").clipShape(Circle()).frame(width: 80, height: 80, alignment: .topLeading)
            VStack(alignment: .leading) {
                ZStack(alignment: .topLeading) {
                     Text("Hello Harry")
                }
                ZStack(alignment: .topLeading) {
                     Text("How are you doing?")
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
