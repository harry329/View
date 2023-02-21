/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow strict-local
 */

import type {Node} from 'react';
import React from 'react';
import {SafeAreaView, StatusBar, StyleSheet, Text, useColorScheme, View,} from 'react-native';

import {Colors,} from 'react-native/Libraries/NewAppScreen';

const App = () => {
  const isDarkMode = useColorScheme() === 'dark';

  const backgroundStyle = {
    backgroundColor: isDarkMode ? Colors.darker : Colors.lighter,
  };

  return (
    <SafeAreaView style={backgroundStyle}>
      <StatusBar barStyle={isDarkMode ? 'light-content' : 'dark-content'} />
      <View style={styles.centerContainer}>
          <View style={styles.columnContainer}>
            <Text>Hello From RN</Text>
          </View>
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  centerContainer : {
    height: '100%',
    justifyContent: 'center',
    alignItems: 'center'
  },
  columnContainer : {
    flexDirection: "column",
    justifyContent: 'center',
    alignItems: 'center',
    flex: 1,
  },
  textView : {
    fontSize : 12,
    color: '#000000'
  }
});

export default App;
