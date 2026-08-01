package defpackage;

import j$.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6713e implements InterfaceC7035e, InterfaceC3195e {
    public static final String startapp = new String();
    public final Level ad;
    public AbstractC3747e appmetrica;
    public Object[] billing;
    public AbstractC3184e license;
    public C10656e metrica;
    public C17903e purchase;
    public final long vip;
    public final /* synthetic */ C16089e yandex;

    public C6713e(C16089e c16089e, Level level) {
        Objects.requireNonNull(c16089e);
        this.yandex = c16089e;
        AbstractC2988e.ad.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.metrica = null;
        this.license = null;
        this.appmetrica = null;
        this.purchase = null;
        this.billing = null;
        AbstractC9835e.advert(level, "level");
        this.ad = level;
        this.vip = nanos;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍٗ٘, eؙؕؕ, java.lang.Object] */
    @Override // defpackage.InterfaceC3195e
    public final InterfaceC3195e ad() {
        ?? obj = new Object();
        obj.vip = 0;
        if (this.license == null) {
            this.license = obj;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eَۥۢ, java.lang.Object] */
    public final void appmetrica(C9492e c9492e, Object obj) {
        if (this.metrica == null) {
            ?? obj2 = new Object();
            obj2.metrica = new Object[8];
            obj2.license = 0;
            this.metrica = obj2;
        }
        this.metrica.amazon(c9492e, obj);
    }

    public final AbstractC9743e license() {
        C10656e c10656e = this.metrica;
        return c10656e != null ? c10656e : C8523e.metrica;
    }

    @Override // defpackage.InterfaceC3195e
    public final InterfaceC3195e metrica(Throwable th) {
        C9492e c9492e = AbstractC14416e.ad;
        AbstractC9835e.advert(c9492e, "metadata key");
        if (th != null) {
            appmetrica(c9492e, th);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
    @Override // defpackage.InterfaceC3195e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(java.lang.String r19, java.lang.Object[] r20) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6713e.vip(java.lang.String, java.lang.Object[]):void");
    }
}
