package defpackage;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eٓۥٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14370e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2299e f28423e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28424e;

    public /* synthetic */ C14370e(C2299e c2299e, int i) {
        this.f28424e = i;
        this.f28423e = c2299e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f28424e;
        C2299e c2299e = this.f28423e;
        switch (i) {
            case 0:
                return AbstractC5965e.vip(c2299e.adcel());
            default:
                InterfaceC12132e adcel = c2299e.adcel();
                int i2 = c2299e.f5814e;
                AbstractC12141e abstractC12141e = c2299e.f5816e;
                if (adcel instanceof C16169e) {
                    InterfaceC0390e isPro = abstractC12141e.isPro();
                    C12816e c12816e = AbstractC5965e.ad;
                    if (AbstractC7890e.billing(isPro.mo329e() != null ? ((InterfaceC5052e) isPro.mo1351switch()).mo1727e() : null, adcel) && abstractC12141e.isPro().mo334e() == 2) {
                        Class yandex = AbstractC5965e.yandex((InterfaceC5052e) abstractC12141e.isPro().mo1351switch());
                        if (yandex != null) {
                            return yandex;
                        }
                        throw new Error("Cannot determine receiver Java type of inherited declaration: " + adcel);
                    }
                }
                InterfaceC9739e vip = abstractC12141e.vip();
                if (!(vip instanceof C11300e)) {
                    if (!(vip instanceof C3039e)) {
                        return (Type) vip.ad().get(i2);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((C3039e) vip).license.get(i2)).toArray(new Class[0]);
                    Type[] typeArr = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length = typeArr.length;
                    if (length != 0) {
                        return length != 1 ? new C1849e(typeArr) : (Type) AbstractC1660e.m676try(typeArr);
                    }
                    throw new Error("Expected at least 1 type for compound type");
                }
                boolean vip2 = AbstractC13467e.vip(abstractC12141e);
                Collection collection = C13664e.f27089e;
                if (vip2) {
                    C11300e c11300e = (C11300e) vip;
                    C15926e appmetrica = c11300e.appmetrica(i2 + 1);
                    int i3 = c11300e.appmetrica(0).f22522e + 1;
                    List ad = c11300e.vip.ad();
                    int i4 = appmetrica.f22523e - i3;
                    C11241e c11241e = new C11241e(i4, appmetrica.f22522e - i3, 1);
                    if (!c11241e.isEmpty()) {
                        collection = AbstractC13480e.m3575continue(ad.subList(i4, c11241e.f22522e + 1));
                    }
                } else {
                    C11300e c11300e2 = (C11300e) vip;
                    C15926e appmetrica2 = c11300e2.appmetrica(i2);
                    List ad2 = c11300e2.vip.ad();
                    if (!appmetrica2.isEmpty()) {
                        collection = AbstractC13480e.m3575continue(ad2.subList(appmetrica2.f22523e, appmetrica2.f22522e + 1));
                    }
                }
                Type[] typeArr2 = (Type[]) collection.toArray(new Type[0]);
                Type[] typeArr3 = (Type[]) Arrays.copyOf(typeArr2, typeArr2.length);
                int length2 = typeArr3.length;
                if (length2 != 0) {
                    return length2 != 1 ? new C1849e(typeArr3) : (Type) AbstractC1660e.m676try(typeArr3);
                }
                throw new Error("Expected at least 1 type for compound type");
        }
    }
}
