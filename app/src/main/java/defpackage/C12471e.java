package defpackage;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12471e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14564e f24966e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24967e;

    public /* synthetic */ C12471e(C14564e c14564e, int i) {
        this.f24967e = i;
        this.f24966e = c14564e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f24967e;
        C0115e c0115e = C0115e.f1276e;
        int i2 = 18;
        int i3 = 4;
        C14564e c14564e = this.f24966e;
        int i4 = 1;
        byte b = 0;
        switch (i) {
            case 0:
                C18055e c18055e = (C18055e) obj;
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c13770e.purchase(c18055e) ? 4 : 2;
                }
                if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                    c14564e.m3825instanceof(AbstractC8703e.mopub(c18055e, c0115e), c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    C2892e license = AbstractC16653e.license(-1165619608, new C0806e(c14564e, i4, b), c13770e2);
                    float f = AbstractC11992e.ad;
                    AbstractC16429e.ad(AbstractC10672e.amazon, null, null, null, AbstractC10672e.loadAd, license, AbstractC11992e.ad(C3618e.startapp, 0L, 0L, 0L, c13770e2, 510), 0.0f, 0.0f, c13770e2, 221190, 398);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 17) != 16)) {
                    c13770e3.m3676strictfp(-735019606);
                    ListIterator listIterator = C14564e.f28775e.listIterator(0);
                    while (true) {
                        boolean hasNext = listIterator.hasNext();
                        Object obj4 = C2987e.ad;
                        if (hasNext) {
                            C6571e c6571e = (C6571e) listIterator.next();
                            int intValue4 = ((Number) c6571e.f13544e).intValue();
                            int intValue5 = ((Number) c6571e.f13543e).intValue();
                            c13770e3.m3662final(-735017741, Integer.valueOf(intValue4));
                            boolean license2 = c13770e3.license(intValue4) | c13770e3.yandex(c14564e);
                            Object m3681throw = c13770e3.m3681throw();
                            if (license2 || m3681throw == obj4) {
                                m3681throw = new C8779e(intValue4, c14564e, i3);
                                c13770e3.m3682throws(m3681throw);
                            }
                            AbstractC2937e.purchase((Function0) m3681throw, AbstractC16653e.license(-879756080, new C2172e(intValue5, i2, b), c13770e3), null, false, null, null, null, null, null, null, c13770e3, 48);
                            c13770e3.Signature(false);
                        } else {
                            c13770e3.Signature(false);
                            boolean yandex = c13770e3.yandex(c14564e);
                            Object m3681throw2 = c13770e3.m3681throw();
                            if (yandex || m3681throw2 == obj4) {
                                m3681throw2 = new C8219e(c14564e, 5);
                                c13770e3.m3682throws(m3681throw2);
                            }
                            AbstractC2937e.purchase((Function0) m3681throw2, AbstractC10672e.smaato, null, false, null, null, null, null, null, null, c13770e3, 48);
                        }
                    }
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C18055e c18055e2 = (C18055e) obj;
                C13770e c13770e4 = (C13770e) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= c13770e4.purchase(c18055e2) ? 4 : 2;
                }
                if (c13770e4.m3673protected(intValue6 & 1, (intValue6 & 19) != 18)) {
                    c14564e.m3829strictfp(AbstractC8703e.mopub(c18055e2, c0115e), c13770e4, 0);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                C18055e c18055e3 = (C18055e) obj;
                C13770e c13770e5 = (C13770e) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= c13770e5.purchase(c18055e3) ? 4 : 2;
                }
                if (c13770e5.m3673protected(intValue7 & 1, (intValue7 & 19) != 18)) {
                    c14564e.m3827private(AbstractC8703e.mopub(c18055e3, c0115e), c13770e5, 0);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C18055e c18055e4 = (C18055e) obj;
                C13770e c13770e6 = (C13770e) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= c13770e6.purchase(c18055e4) ? 4 : 2;
                }
                if (c13770e6.m3673protected(intValue8 & 1, (intValue8 & 19) != 18)) {
                    c14564e.m3831transient(AbstractC8703e.mopub(c18055e4, c0115e), c13770e6, 0);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
