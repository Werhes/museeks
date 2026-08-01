package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؐۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3804e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8415e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8416e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9289e f8417e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f8418e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ List f8419e;

    public C3804e(InterfaceC8346e interfaceC8346e, C9289e c9289e, Function1 function1, Function1 function12, Function1 function13) {
        this.f8419e = interfaceC8346e;
        this.f8417e = c9289e;
        this.f8416e = function1;
        this.f8418e = function12;
        this.f8415e = function13;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C18236e c18236e;
        Object obj5 = (C18055e) obj;
        int intValue = ((Number) obj2).intValue();
        C13770e c13770e = (C13770e) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (c13770e.purchase(obj5) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= c13770e.license(intValue) ? 32 : 16;
        }
        if (c13770e.m3673protected(i & 1, (i & 147) != 146)) {
            Object obj6 = (InterfaceC12986e) this.f8419e.get(intValue);
            c13770e.m3676strictfp(-710224281);
            boolean billing = AbstractC7890e.billing(obj6, C4436e.ad);
            C0115e c0115e = C0115e.f1276e;
            Object obj7 = C2987e.ad;
            String str = null;
            if (billing) {
                c13770e.m3676strictfp(-710191143);
                InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                Object obj8 = this.f8417e;
                boolean yandex = c13770e.yandex(obj8);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == obj7) {
                    Object c7755e = new C7755e(0, obj8, C9289e.class, "onPlaylistLinkClicked", "onPlaylistLinkClicked()V", 0, 0, 0);
                    c13770e.m3682throws(c7755e);
                    m3681throw = c7755e;
                }
                AbstractC1660e.license(AbstractC9546e.license(metrica, false, null, (Function0) ((InterfaceC5261e) m3681throw), 15), c13770e, 0);
                c13770e.Signature(false);
            } else if (AbstractC7890e.billing(obj6, C10394e.ad)) {
                c13770e.m3676strictfp(-709845090);
                AbstractC1660e.metrica(AbstractC12220e.mopub(AbstractC18007e.metrica(c0115e, 1.0f), 16), c13770e, 6);
                c13770e.Signature(false);
            } else if (obj6 instanceof C13309e) {
                c13770e.m3676strictfp(-709576785);
                c13770e.Signature(false);
            } else {
                if (!(obj6 instanceof C11973e)) {
                    throw AbstractC1786e.loadAd(808373532, c13770e, false);
                }
                c13770e.m3676strictfp(-709485118);
                C11973e c11973e = (C11973e) obj6;
                C18422e c18422e = c11973e.vip;
                C5442e c5442e = c18422e.admob;
                if (c5442e != null && (c18236e = c5442e.appmetrica) != null) {
                    str = c18236e.purchase;
                }
                String str2 = c18422e.license;
                String str3 = c18422e.ad;
                boolean booleanValue = ((Boolean) this.f8416e.invoke(c11973e.ad)).booleanValue();
                Function1 function1 = this.f8418e;
                boolean purchase = c13770e.purchase(function1) | c13770e.yandex(obj6);
                Object m3681throw2 = c13770e.m3681throw();
                if (purchase || m3681throw2 == obj7) {
                    m3681throw2 = new C4006e(function1, c11973e, 0);
                    c13770e.m3682throws(m3681throw2);
                }
                Function0 function0 = (Function0) m3681throw2;
                InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                InterfaceC17220e interfaceC17220e = (InterfaceC17220e) c13770e.adcel(AbstractC10746e.ad);
                Function1 function12 = this.f8415e;
                boolean purchase2 = c13770e.purchase(function12) | c13770e.yandex(obj6);
                Object m3681throw3 = c13770e.m3681throw();
                if (purchase2 || m3681throw3 == obj7) {
                    m3681throw3 = new C4006e(function12, c11973e, 1);
                    c13770e.m3682throws(m3681throw3);
                }
                Function0 function02 = (Function0) m3681throw3;
                boolean yandex2 = c13770e.yandex(obj6) | c13770e.purchase(function1);
                Object m3681throw4 = c13770e.m3681throw();
                if (yandex2 || m3681throw4 == obj7) {
                    m3681throw4 = new C4006e(function1, c11973e, 2);
                    c13770e.m3682throws(m3681throw4);
                }
                AbstractC1660e.vip(0, c13770e, AbstractC9546e.appmetrica(metrica2, null, interfaceC17220e, false, function02, (Function0) m3681throw4, 444), str, str2, str3, function0, booleanValue);
                c13770e.Signature(false);
            }
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
