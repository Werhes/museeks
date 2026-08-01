package defpackage;

import android.media.session.MediaSessionManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8066e extends C16184e {
    public C8066e(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public static String ad(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
