package im.actor.server.userconfig

import im.actor.server.model.{ Peer, PeerType }

object SettingsKeys {
  private def wrap(deviceType: String, postfix: String): String = s"category.$deviceType.notification.$postfix"

  private def wrapEnabled(deviceType: String): String = s"category.$deviceType.notification.enabled"

  private def wrapEnabled(deviceType: String, postfix: String): String = s"category.$deviceType.notification.$postfix.enabled"

  def enabled(deviceType: String) = wrapEnabled(deviceType)

  def soundEnabled(deviceType: String) = wrapEnabled(deviceType, "sound")

  def vibrationEnabled(deviceType: String) = wrapEnabled(deviceType, "vibration")

  def textEnabled(deviceType: String) = wrap(deviceType, "show_text")
}
