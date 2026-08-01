package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4233e extends CancellationException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC4233e(String str, int i) {
        super(str);
        this.f9300e = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f9300e) {
            case 0:
                setStackTrace(AbstractC4520e.ad);
                return this;
            case 1:
                setStackTrace(AbstractC16565e.ad);
                return this;
            default:
                setStackTrace(AbstractC0258e.ad);
                return this;
        }
    }
}
