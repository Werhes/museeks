package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۢۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10610e implements InterfaceC4629e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16366e f20912e = new C16366e(0);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C9439e f20913e = new Object();

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C7716e f20914e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C7716e f20915e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C16366e f20916e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final HashMap f20917e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f20918e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final HashMap f20919e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eًؕۖ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eًؕۖ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eٍّۤ] */
    static {
        final int i = 0;
        f20915e = new InterfaceC18171e() { // from class: eًؕۖ
            @Override // defpackage.InterfaceC5898e
            public final void ad(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((InterfaceC7445e) obj2).vip((String) obj);
                        return;
                    default:
                        ((InterfaceC7445e) obj2).metrica(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i2 = 1;
        f20914e = new InterfaceC18171e() { // from class: eًؕۖ
            @Override // defpackage.InterfaceC5898e
            public final void ad(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((InterfaceC7445e) obj2).vip((String) obj);
                        return;
                    default:
                        ((InterfaceC7445e) obj2).metrica(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public C10610e() {
        HashMap hashMap = new HashMap();
        this.f20919e = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f20917e = hashMap2;
        this.f20916e = f20912e;
        this.f20918e = false;
        hashMap2.put(String.class, f20915e);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f20914e);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f20913e);
        hashMap.remove(Date.class);
    }

    @Override // defpackage.InterfaceC4629e
    public final InterfaceC4629e startapp(Class cls, InterfaceC1848e interfaceC1848e) {
        this.f20919e.put(cls, interfaceC1848e);
        this.f20917e.remove(cls);
        return this;
    }
}
