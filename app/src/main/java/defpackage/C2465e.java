package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2465e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6488e f6303e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6304e;

    public /* synthetic */ C2465e(C6488e c6488e, int i) {
        this.f6304e = i;
        this.f6303e = c6488e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C16439e c16439e = (C16439e) obj;
        switch (this.f6304e) {
            case 0:
                int i = c16439e.adcel;
                C6488e c6488e = this.f6303e;
                return i == 1 ? c16439e.metrica ? c6488e.tapsense() : c6488e.isVip() : c6488e.firebase();
            case 1:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z = c16439e.metrica;
                C6488e c6488e2 = this.f6303e;
                return z ? c6488e2.tapsense() : c6488e2.isVip();
            case 2:
                if (c16439e.adcel != 2) {
                    return null;
                }
                C6488e c6488e3 = this.f6303e;
                return new C13699e(c6488e3.remoteconfig(), c6488e3.crashlytics(), 10.0d, 1, false, 3, 16);
            case 3:
                if (c16439e.adcel != 1) {
                    return null;
                }
                boolean z2 = c16439e.metrica;
                C6488e c6488e4 = this.f6303e;
                return z2 ? c6488e4.tapsense() : c6488e4.isVip();
            case 4:
                if (c16439e.adcel != 2) {
                    return null;
                }
                C6488e c6488e5 = this.f6303e;
                return new C13699e(c6488e5.isPro(), c6488e5.m2191interface(), 10.0d, 1, false, 3, 16);
            default:
                if (c16439e.adcel != 1) {
                    return null;
                }
                C6488e c6488e6 = this.f6303e;
                return new C13699e(c6488e6.remoteconfig(), c6488e6.subscription(), 5.0d, 4, false, 3, 16);
        }
    }
}
