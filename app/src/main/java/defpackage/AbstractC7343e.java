package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7343e {
    public static Notification.MediaStyle ad() {
        return new Notification.MediaStyle();
    }

    public static void appmetrica(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }

    public static void license(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void metrica(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    public static Notification.MediaStyle vip(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            appmetrica(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            metrica(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f33e);
        }
        return mediaStyle;
    }
}
