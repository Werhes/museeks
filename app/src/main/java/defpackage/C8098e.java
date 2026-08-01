package defpackage;

import android.app.Notification;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٞٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8098e {
    public final int ad;
    public final Notification metrica;
    public final int vip;

    public C8098e(int i, Notification notification, int i2) {
        this.ad = i;
        this.metrica = notification;
        this.vip = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8098e.class != obj.getClass()) {
            return false;
        }
        C8098e c8098e = (C8098e) obj;
        if (this.ad == c8098e.ad && this.vip == c8098e.vip) {
            return this.metrica.equals(c8098e.metrica);
        }
        return false;
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.ad + ", mForegroundServiceType=" + this.vip + ", mNotification=" + this.metrica + '}';
    }
}
