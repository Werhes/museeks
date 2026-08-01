package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۟ؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6684e implements InterfaceC10481e {
    public final /* synthetic */ InterfaceC10481e ad;
    public final C6656e metrica;
    public final C6656e vip;

    public C6684e(InterfaceC10481e interfaceC10481e, final C17210e c17210e) {
        this.ad = interfaceC10481e;
        final int i = 0;
        this.vip = AbstractC14533e.purchase(new Function0() { // from class: eًٍؚ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C17210e c17210e2 = c17210e;
                        return Boolean.valueOf(c17210e2.ad.purchase() < c17210e2.vip.purchase());
                    default:
                        return Boolean.valueOf(c17210e.ad.purchase() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.metrica = AbstractC14533e.purchase(new Function0() { // from class: eًٍؚ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C17210e c17210e2 = c17210e;
                        return Boolean.valueOf(c17210e2.ad.purchase() < c17210e2.vip.purchase());
                    default:
                        return Boolean.valueOf(c17210e.ad.purchase() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return this.ad.ad();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return this.ad.appmetrica(f);
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean license() {
        return ((Boolean) this.vip.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean metrica() {
        return ((Boolean) this.metrica.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final Object vip(EnumC6955e enumC6955e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        return this.ad.vip(enumC6955e, function2, interfaceC5083e);
    }
}
