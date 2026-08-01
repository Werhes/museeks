package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15158e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30006e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30007e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30008e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f30009e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30010e;

    public /* synthetic */ C15158e(C12817e c12817e, EnumC11342e enumC11342e, String str, Function0 function0, int i) {
        this.f30010e = 3;
        this.f30008e = c12817e;
        this.f30007e = enumC11342e;
        this.f30009e = str;
        this.f30006e = function0;
    }

    public /* synthetic */ C15158e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f30010e = i;
        this.f30008e = obj;
        this.f30007e = obj2;
        this.f30009e = obj3;
        this.f30006e = obj4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30010e) {
            case 0:
                InterfaceC12864e interfaceC12864e = (InterfaceC12864e) this.f30008e;
                C6260e c6260e = (C6260e) this.f30007e;
                C6260e c6260e2 = (C6260e) this.f30009e;
                C10070e c10070e = (C10070e) this.f30006e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    float f = 16;
                    C16005e metrica = AbstractC12220e.metrica(f, 0.0f, 2);
                    C13964e billing = AbstractC16497e.billing(f);
                    InterfaceC12864e metrica2 = AbstractC8116e.metrica(AbstractC18366e.license(interfaceC12864e, c6260e), c6260e2);
                    boolean yandex = c13770e.yandex(c10070e) | c13770e.purchase(c6260e2);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C13942e(c10070e, c6260e2, 5);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC7023e.vip(metrica2, null, metrica, billing, null, null, false, null, (Function1) m3681throw, c13770e, 24960, 490);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC4895e interfaceC4895e = (InterfaceC4895e) this.f30008e;
                C4246e c4246e = (C4246e) this.f30007e;
                C4246e c4246e2 = (C4246e) this.f30009e;
                C4246e c4246e3 = (C4246e) this.f30006e;
                int intValue2 = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue2 == 21589) {
                    if (longValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte readByte = interfaceC4895e.readByte();
                    boolean z = (readByte & 1) == 1;
                    boolean z2 = (readByte & 2) == 2;
                    boolean z3 = (readByte & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (longValue < j) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        c4246e.f9318e = Integer.valueOf(interfaceC4895e.mo1684finally());
                    }
                    if (z2) {
                        c4246e2.f9318e = Integer.valueOf(interfaceC4895e.mo1684finally());
                    }
                    if (z3) {
                        c4246e3.f9318e = Integer.valueOf(interfaceC4895e.mo1684finally());
                    }
                }
                return Unit.INSTANCE;
            case 2:
                C4246e c4246e4 = (C4246e) this.f30008e;
                C13197e c13197e = (C13197e) this.f30007e;
                C4246e c4246e5 = (C4246e) this.f30009e;
                C4246e c4246e6 = (C4246e) this.f30006e;
                int intValue3 = ((Integer) obj).intValue();
                long longValue2 = ((Long) obj2).longValue();
                if (intValue3 == 1) {
                    if (c4246e4.f9318e != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (longValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    c4246e4.f9318e = Long.valueOf(c13197e.mo1679e());
                    c4246e5.f9318e = Long.valueOf(c13197e.mo1679e());
                    c4246e6.f9318e = Long.valueOf(c13197e.mo1679e());
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC0607e.ad((C12817e) this.f30008e, (EnumC11342e) this.f30007e, (String) this.f30009e, (Function0) this.f30006e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
