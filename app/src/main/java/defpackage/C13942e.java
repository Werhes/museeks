package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13942e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f27652e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27653e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27654e;

    public /* synthetic */ C13942e(Object obj, Object obj2, int i) {
        this.f27654e = i;
        this.f27653e = obj;
        this.f27652e = obj2;
    }

    private final Object ad(Object obj) {
        C10503e c10503e = (C10503e) this.f27653e;
        C6467e c6467e = (C6467e) this.f27652e;
        synchronized (c10503e.mopub) {
            c10503e.isVip.remove(c6467e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [eؚۛۖ, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 11;
        int i2 = 27;
        InterfaceC5083e interfaceC5083e = null;
        int i3 = 1;
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        switch (this.f27654e) {
            case 0:
                C13119e c13119e = (C13119e) this.f27653e;
                C13119e c13119e2 = (C13119e) this.f27652e;
                c13119e.adcel.add(c13119e2);
                return new C15302e(c13119e, c13119e2, 8);
            case 1:
                return new C15302e((C13119e) this.f27653e, (C15037e) this.f27652e, 9);
            case 2:
                C6260e c6260e = (C6260e) this.f27653e;
                C13389e c13389e = (C13389e) this.f27652e;
                InterfaceC6641e interfaceC6641e = (InterfaceC6641e) obj;
                c6260e.metrica();
                if (interfaceC6641e instanceof C13796e) {
                    ?? r0 = c13389e.metrica;
                    C13796e c13796e = (C13796e) interfaceC6641e;
                    int i4 = c13796e.metrica;
                    long j = c13796e.license;
                    String str = c13796e.appmetrica;
                    String str2 = c13796e.ad;
                    String str3 = c13796e.purchase;
                    if (str3 == null) {
                        str3 = BuildConfig.FLAVOR;
                    }
                    r0.invoke(new C5869e(i4, c13796e.vip, j, str, str2, str3));
                } else {
                    ((C12742e) c13389e.purchase.f16176e).add(0, new C12911e(new C7228e("New event"), new C7228e(interfaceC6641e.toString())));
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f27653e;
                C6260e c6260e2 = (C6260e) this.f27652e;
                InterfaceC8346e interfaceC8346e = (InterfaceC8346e) interfaceC16132e.getValue();
                int i5 = 25;
                ((C17213e) obj).mopub(((AbstractC7674e) interfaceC8346e).subs(), new C17874e(new C14151e(objArr3 == true ? 1 : 0, i5), interfaceC8346e, i2), new C7976e(interfaceC8346e, i5, objArr2 == true ? 1 : 0), new C2892e(2039820996, true, new C2494e(interfaceC8346e, c6260e2, objArr == true ? 1 : 0)));
                return Unit.INSTANCE;
            case 4:
                ((C6260e) this.f27653e).metrica();
                ((Function1) this.f27652e).invoke((InterfaceC6641e) obj);
                return Unit.INSTANCE;
            case 5:
                C10070e c10070e = (C10070e) this.f27653e;
                C6260e c6260e3 = (C6260e) this.f27652e;
                InterfaceC8346e interfaceC8346e2 = c10070e.ad;
                int i6 = 26;
                ((C17213e) obj).mopub(((AbstractC7674e) interfaceC8346e2).subs(), new C17874e(new C14151e(objArr5 == true ? 1 : 0, i6), interfaceC8346e2, 28), new C7976e(interfaceC8346e2, i6, objArr4 == true ? 1 : 0), new C2892e(2039820996, true, new C2494e(interfaceC8346e2, c6260e3, i3)));
                return Unit.INSTANCE;
            case 6:
                C11086e c11086e = (C11086e) this.f27653e;
                C6260e c6260e4 = (C6260e) this.f27652e;
                InterfaceC8346e interfaceC8346e3 = c11086e.ad;
                ((C11324e) obj).vip.appmetrica(((AbstractC7674e) interfaceC8346e3).subs(), new C11215e(new C17874e(new C14151e(b, i2), interfaceC8346e3, 29), C11324e.metrica, new C7976e(interfaceC8346e3, i2, objArr6 == true ? 1 : 0), new C2892e(-1942245546, true, new C2494e(interfaceC8346e3, c6260e4, 2))));
                return Unit.INSTANCE;
            case 7:
                C5891e c5891e = (C5891e) this.f27653e;
                C6522e c6522e = (C6522e) this.f27652e;
                InterfaceC1966e interfaceC1966e = (InterfaceC1966e) obj;
                synchronized (((C14595e) c5891e.f12440e)) {
                    try {
                        if (interfaceC1966e.ad()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                C13552e c13552e = (C13552e) this.f27653e;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f27652e;
                c13552e.f26854e.setValue(EnumC1894e.f5042e);
                AbstractC5336e.purchase(interfaceC18435e, null, 0, new C16373e(c13552e, (C15797e) obj, interfaceC5083e, i3), 3);
                return Unit.INSTANCE;
            case 9:
                C13552e c13552e2 = (C13552e) this.f27653e;
                Function1 function1 = (Function1) this.f27652e;
                C12742e c12742e = c13552e2.f26852e;
                ((C17213e) obj).mopub(c12742e.size(), null, new C16296e(0, c12742e), new C2892e(2039820996, true, new C4208e(10, c12742e, function1, c13552e2)));
                return Unit.INSTANCE;
            case 10:
                C12672e c12672e = (C12672e) this.f27653e;
                AbstractC10727e abstractC10727e = (AbstractC10727e) this.f27652e;
                List list = (List) c12672e.f25404e.getValue();
                ((C17213e) obj).mopub(list.size(), null, new C16296e(1, list), new C2892e(802480018, true, new C4208e(i, list, c12672e, abstractC10727e)));
                return Unit.INSTANCE;
            case 11:
                C0243e c0243e = (C0243e) this.f27653e;
                Function1 function12 = (Function1) this.f27652e;
                ((Long) obj).longValue();
                float f = c0243e.appmetrica;
                c0243e.appmetrica = 0.0f;
                function12.invoke(Float.valueOf(f));
                return Unit.INSTANCE;
            case 12:
                return ad(obj);
            case 13:
                ((Function1) ((C6571e) this.f27653e).f13543e).invoke(((C13372e) this.f27652e).f26633e);
                ((C3566e) obj).purchase();
                return Unit.INSTANCE;
            case 14:
                String str4 = (String) this.f27653e;
                List list2 = (List) this.f27652e;
                C5114e c5114e = (C5114e) obj;
                C1649e metrica = c5114e.m1758e(AbstractC3820e.ad.vip(CachedTrack.class), "albumFullId == $0", Arrays.copyOf(new Object[]{str4}, 1)).metrica();
                Iterator it = metrica.iterator();
                while (it.hasNext()) {
                    String applovin = ((CachedTrack) it.next()).applovin();
                    if (applovin != null) {
                        list2.add(applovin);
                    }
                }
                c5114e.m1759e(metrica);
                c5114e.m1759e(c5114e.m1758e(AbstractC3820e.ad.vip(CachedAlbum.class), "uid == $0", Arrays.copyOf(new Object[]{str4}, 1)).metrica());
                return Unit.INSTANCE;
            default:
                C8845e c8845e = (C8845e) this.f27653e;
                View view = (View) this.f27652e;
                c8845e.ad(view);
                return new C15302e(c8845e, view, i);
        }
    }
}
