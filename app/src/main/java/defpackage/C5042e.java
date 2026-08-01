package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٝٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5042e implements InterfaceC18435e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8208e f10748e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10749e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public AbstractC16824e f10750e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC4393e f10751e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9398e f10752e;
    private volatile /* synthetic */ int received = 0;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(Object.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(Object.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        f10748e = new C8208e("CustomResponse", new C12025e(vip, interfaceC13984e));
        f10749e = AtomicIntegerFieldUpdater.newUpdater(C5042e.class, "received");
    }

    public C5042e(C9398e c9398e) {
        this.f10752e = c9398e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        if (r8 != r5) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C12025e r7, defpackage.AbstractC10731e r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5042e.ad(eِ۟ۥ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        AbstractC16824e abstractC16824e = this.f10750e;
        if (abstractC16824e == null) {
            abstractC16824e = null;
        }
        return abstractC16824e.advert();
    }

    public final C5874e getAttributes() {
        InterfaceC4393e interfaceC4393e = this.f10751e;
        if (interfaceC4393e == null) {
            interfaceC4393e = null;
        }
        return interfaceC4393e.getAttributes();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpClientCall[");
        InterfaceC4393e interfaceC4393e = this.f10751e;
        if (interfaceC4393e == null) {
            interfaceC4393e = null;
        }
        sb.append(interfaceC4393e.getUrl());
        sb.append(", ");
        AbstractC16824e abstractC16824e = this.f10750e;
        sb.append((abstractC16824e != null ? abstractC16824e : null).billing());
        sb.append(']');
        return sb.toString();
    }

    public boolean vip() {
        return false;
    }
}
