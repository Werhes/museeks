package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۙۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9719e extends CancellationException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9719e(String str, int i) {
        super(str);
        this.f19218e = i;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f19218e) {
            case 1:
                setStackTrace(AbstractC6762e.f13967e);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
