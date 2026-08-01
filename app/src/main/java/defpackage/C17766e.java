package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17766e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f34846e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f34847e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34848e;

    public /* synthetic */ C17766e(int i, Collection collection) {
        this.f34848e = 3;
        this.f34847e = i;
        this.f34846e = collection;
    }

    public /* synthetic */ C17766e(Object obj, int i, int i2) {
        this.f34848e = i2;
        this.f34846e = obj;
        this.f34847e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f34848e;
        Object[] objArr = 0;
        int i2 = 1;
        int i3 = this.f34847e;
        Object obj2 = this.f34846e;
        switch (i) {
            case 0:
                String str = (String) obj2;
                C2573e c2573e = (C2573e) obj;
                C12347e c12347e = c2573e.f6435e;
                if (c12347e != null) {
                    long j = c12347e.ad;
                    AbstractC6286e.purchase(c2573e, (int) (j >> 32), (int) (4294967295L & j), str);
                } else {
                    long j2 = c2573e.f6428e;
                    int i4 = C12347e.metrica;
                    AbstractC6286e.purchase(c2573e, (int) (j2 >> 32), (int) (4294967295L & j2), str);
                }
                long j3 = c2573e.f6428e;
                int i5 = C12347e.metrica;
                int i6 = (int) (j3 >> 32);
                int metrica = AbstractC3062e.metrica(i3 > 0 ? (i6 + i3) - 1 : (i6 + i3) - str.length(), 0, c2573e.f6429e.length());
                c2573e.billing(AbstractC9262e.metrica(metrica, metrica));
                return Unit.INSTANCE;
            case 1:
                C4885e c4885e = (C4885e) obj;
                C13751e c13751e = ((C8202e) obj2).ad;
                AbstractC13717e adcel = AbstractC12640e.adcel();
                AbstractC12640e.Signature(adcel, AbstractC12640e.smaato(adcel), adcel != null ? adcel.appmetrica() : null);
                c13751e.getClass();
                int i7 = c4885e.ad;
                if (i7 == -1) {
                    i7 = 2;
                }
                for (int i8 = 0; i8 < i7; i8++) {
                    c4885e.ad(i3 + i8);
                }
                return Unit.INSTANCE;
            case 2:
                C10122e c10122e = (C10122e) obj;
                float abs = Math.abs(((C2616e) ((AbstractC16904e) obj2).license.f17053e).purchase() + (((C16330e) r5.license.f17056e).purchase() - i3));
                c10122e.metrica(C8738e.appmetrica(0.5f, 1.0f, 1.0f - AbstractC3062e.vip(abs, 0.0f, 1.0f)));
                float appmetrica = C8738e.appmetrica(0.75f, 1.0f, 1.0f - AbstractC3062e.vip(abs, 0.0f, 1.0f));
                c10122e.advert(appmetrica);
                c10122e.smaato(appmetrica);
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(((List) obj).addAll(i3, (Collection) obj2));
            default:
                C1374e c1374e = (C1374e) obj2;
                C17213e c17213e = (C17213e) obj;
                InterfaceC3314e interfaceC3314e = c1374e.f4167e[i3];
                InterfaceC3314e interfaceC3314e2 = c1374e.f4169e[i3];
                AbstractC11110e abstractC11110e = (AbstractC11110e) interfaceC3314e.getValue();
                c17213e.mopub(abstractC11110e.subs(), null, new C7976e(abstractC11110e, 19, objArr == true ? 1 : 0), new C2892e(802480018, true, new C15055e(abstractC11110e, c1374e, i2)));
                if (((Boolean) interfaceC3314e2.getValue()).booleanValue()) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(-582281940, true, new C3174e(c1374e, i3, 7)), 3);
                }
                return Unit.INSTANCE;
        }
    }
}
