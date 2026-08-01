package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5106e implements AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8839e f10946e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f10947e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4016e f10948e;

    public C5106e(C8839e c8839e, C4016e c4016e) {
        this.f10946e = c8839e;
        this.f10948e = c4016e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f10947e) {
            return;
        }
        this.f10947e = true;
        C8839e c8839e = this.f10946e;
        synchronized (c8839e.f17753e) {
            try {
                C4016e c4016e = this.f10948e;
                int i = c4016e.yandex - 1;
                c4016e.yandex = i;
                if (i == 0 && c4016e.purchase) {
                    c8839e.ads(c4016e);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
