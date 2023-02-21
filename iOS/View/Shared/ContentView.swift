//
//  ContentView.swift
//  Shared
//
//  Created by Harsimran Singh on 11/21/21.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
            VStack(alignment: .leading) {
                ZStack(alignment: .topLeading) {
                     Text("Hello From Swift UI")
                }
            }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
