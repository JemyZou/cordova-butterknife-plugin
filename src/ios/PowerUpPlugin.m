//
//  MyPlugin.m
//  HelloCordova
//
//  Created by Jerry on 26/10/2017.
//

#import "PowerUpPlugin.h"
#import <LeaderPowerUpLibrary/LeaderPowerUpManager.h>

@implementation PowerUpPlugin
- (void)prsentCardView:(CDVInvokedUrlCommand*)command
{
    NSLog(@"Called [PowerUpPlugin %@]", NSStringFromSelector(_cmd));
    [LeaderPowerUpManager presentCardViewController];
}
- (void)prsentStickerView:(CDVInvokedUrlCommand*)command{
    NSLog(@"Called [PowerUpPlugin %@]", NSStringFromSelector(_cmd));
    [LeaderPowerUpManager presentStickerViewController];
}
@end
