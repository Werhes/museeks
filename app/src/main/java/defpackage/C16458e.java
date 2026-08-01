package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16458e extends C17647e {
    @Override // defpackage.C17647e
    public final Signature[] ad(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
