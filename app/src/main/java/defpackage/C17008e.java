package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17008e implements InterfaceC14502e {
    public static final int billing;
    public static final C10445e yandex;
    public final C16723e ad;
    public final C9727e appmetrica;
    public final C6852e license;
    public final C10426e metrica;
    public final C17651e purchase = AbstractC12751e.ad();
    public final InterfaceC4648e vip;

    static {
        C17647e c17647e = C14157e.f27993e;
        billing = (int) C14157e.yandex(AbstractC0326e.Signature(24, EnumC15934e.HOURS), EnumC15934e.SECONDS);
        yandex = new C10445e("/");
    }

    public C17008e(C16723e c16723e, InterfaceC4648e interfaceC4648e, C10426e c10426e, C6852e c6852e, C9727e c9727e) {
        this.ad = c16723e;
        this.vip = interfaceC4648e;
        this.metrica = c10426e;
        this.license = c6852e;
        this.appmetrica = c9727e;
    }

    @Override // defpackage.InterfaceC14502e
    public final Boolean ad() {
        return this.appmetrica.ad().ad;
    }

    @Override // defpackage.InterfaceC14502e
    public final Double license() {
        return this.appmetrica.ad().vip;
    }

    @Override // defpackage.InterfaceC14502e
    public final C14157e metrica() {
        Integer num = this.appmetrica.ad().metrica;
        if (num == null) {
            return null;
        }
        C17647e c17647e = C14157e.f27993e;
        return new C14157e(AbstractC0326e.Signature(num.intValue(), EnumC15934e.SECONDS));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00ad, B:29:0x00b7, B:32:0x00c4, B:38:0x016e, B:40:0x0086, B:42:0x008e, B:45:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00ad, B:29:0x00b7, B:32:0x00c4, B:38:0x016e, B:40:0x0086, B:42:0x008e, B:45:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00ad, B:29:0x00b7, B:32:0x00c4, B:38:0x016e, B:40:0x0086, B:42:0x008e, B:45:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00ad, B:29:0x00b7, B:32:0x00c4, B:38:0x016e, B:40:0x0086, B:42:0x008e, B:45:0x009b), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // defpackage.InterfaceC14502e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vip(defpackage.InterfaceC5083e r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17008e.vip(eًؗۖ):java.lang.Object");
    }
}
