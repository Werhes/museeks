package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18287e {
    public final C16184e ad;

    public C18287e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String ad = C8066e.ad(remoteUserInfo);
        if (ad == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(ad)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.ad = new C8066e(remoteUserInfo);
    }

    public C18287e(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.ad = new C16184e(str, i, i2);
        } else {
            this.ad = new C16184e(str, i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18287e)) {
            return false;
        }
        return this.ad.equals(((C18287e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
