package defpackage;

import android.util.Size;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* renamed from: eٍِ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11797e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C11797e f23675e = new C11797e(27);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23676e;

    public /* synthetic */ C11797e(int i) {
        this.f23676e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23676e) {
            case 0:
                C10445e c10445e = AbstractC15529e.f30670e;
                Integer vip = AbstractC6050e.vip((C8268e) obj, (C8268e) obj2);
                if (vip != null) {
                    return vip.intValue();
                }
                return 0;
            case 1:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 2:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return AbstractC0258e.vip(Long.valueOf(size.getWidth() * size.getHeight()), Long.valueOf(size2.getWidth() * size2.getHeight()));
            case 3:
                return AbstractC0258e.vip(Integer.valueOf(((C1357e) obj).metrica), Integer.valueOf(((C1357e) obj2).metrica));
            case 4:
                return AbstractC0258e.vip(Integer.valueOf(((C2314e) obj).yandex), Integer.valueOf(((C2314e) obj2).yandex));
            case 5:
                return AbstractC0258e.vip(((C11235e) obj).metrica, ((C11235e) obj2).metrica);
            case 6:
                return AbstractC0258e.vip(((C11235e) obj).license, ((C11235e) obj2).license);
            case 7:
                return AbstractC0258e.vip(((C11235e) obj2).metrica, ((C11235e) obj).metrica);
            case 8:
                return AbstractC0258e.vip(((C11235e) obj2).license, ((C11235e) obj).license);
            case 9:
                return AbstractC0258e.vip(Integer.valueOf(((C7883e) obj2).ad), Integer.valueOf(((C7883e) obj).ad));
            case 10:
                return ((C0511e) obj).f2616e - ((C0511e) obj2).f2616e;
            case 11:
                ((C8134e) obj2).getClass();
                ((C8134e) obj).getClass();
                return AbstractC0258e.vip(2, 2);
            case 12:
                ((InterfaceC12397e) obj2).getClass();
                ((InterfaceC12397e) obj).getClass();
                return AbstractC0258e.vip(0, 0);
            case 13:
                return AbstractC0258e.vip((C17621e) ((C6571e) obj2).f13543e, (C17621e) ((C6571e) obj).f13543e);
            case 14:
                return AbstractC0258e.vip(Double.valueOf(((C3546e) obj2).vip), Double.valueOf(((C3546e) obj).vip));
            case 15:
                C16223e c16223e = (C16223e) obj;
                C16223e c16223e2 = (C16223e) obj2;
                return AbstractC0258e.vip(Float.valueOf((c16223e.f31878e.purchase() == 0.0f && c16223e.f31880e == null) ? -1.0f : c16223e.f31878e.purchase()), Float.valueOf((c16223e2.f31878e.purchase() == 0.0f && c16223e2.f31880e == null) ? -1.0f : c16223e2.f31878e.purchase()));
            case 16:
                return AbstractC0258e.vip(((CachedTrack) obj).tapsense(), ((CachedTrack) obj2).tapsense());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC0258e.vip(((CachedTrack) obj).vip(), ((CachedTrack) obj2).vip());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0258e.vip(((CachedTrack) obj2).tapsense(), ((CachedTrack) obj).tapsense());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC0258e.vip(((CachedTrack) obj2).vip(), ((CachedTrack) obj).vip());
            case 20:
                Iterator it = ((C12550e) obj).vip.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer valueOf = Integer.valueOf(C2107e.f5437e.indexOf(((C7662e) it.next()).yandex));
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(C2107e.f5437e.indexOf(((C7662e) it.next()).yandex));
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                Iterator it2 = ((C12550e) obj2).vip.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer valueOf3 = Integer.valueOf(C2107e.f5437e.indexOf(((C7662e) it2.next()).yandex));
                while (it2.hasNext()) {
                    Integer valueOf4 = Integer.valueOf(C2107e.f5437e.indexOf(((C7662e) it2.next()).yandex));
                    if (valueOf3.compareTo(valueOf4) < 0) {
                        valueOf3 = valueOf4;
                    }
                }
                return AbstractC0258e.vip(valueOf, valueOf3);
            case 21:
                Iterator it3 = ((C12550e) obj).vip.iterator();
                if (!it3.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer valueOf5 = Integer.valueOf(C2107e.f5440e.indexOf(new C0299e(((C7662e) it3.next()).metrica)));
                while (it3.hasNext()) {
                    Integer valueOf6 = Integer.valueOf(C2107e.f5440e.indexOf(new C0299e(((C7662e) it3.next()).metrica)));
                    if (valueOf5.compareTo(valueOf6) < 0) {
                        valueOf5 = valueOf6;
                    }
                }
                Iterator it4 = ((C12550e) obj2).vip.iterator();
                if (!it4.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer valueOf7 = Integer.valueOf(C2107e.f5440e.indexOf(new C0299e(((C7662e) it4.next()).metrica)));
                while (it4.hasNext()) {
                    Integer valueOf8 = Integer.valueOf(C2107e.f5440e.indexOf(new C0299e(((C7662e) it4.next()).metrica)));
                    if (valueOf7.compareTo(valueOf8) < 0) {
                        valueOf7 = valueOf8;
                    }
                }
                return AbstractC0258e.vip(valueOf5, valueOf7);
            case 22:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 23:
                return AbstractC0258e.vip(Integer.valueOf(((C11887e) obj).ad), Integer.valueOf(((C11887e) obj2).ad));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C15159e) obj).vip - ((C15159e) obj2).vip;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                EnumC12588e ad = EnumC12588e.ad(EnumC8271e.valueOf(((InterfaceC3589e) obj).getId()));
                EnumC12588e ad2 = EnumC12588e.ad(EnumC8271e.valueOf(((InterfaceC3589e) obj2).getId()));
                int i = Alert.DURATION_SHOW_INDEFINITELY;
                int i2 = ad != null ? ad.f25304e : Integer.MAX_VALUE;
                if (ad2 != null) {
                    i = ad2.f25304e;
                }
                return i2 - i;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return AbstractC0258e.vip(((C12243e) obj).ad, ((C12243e) obj2).ad);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C1032e c1032e = (C1032e) obj2;
                C1032e c1032e2 = (C1032e) obj;
                return !c1032e2.f3493e.equals(c1032e.f3493e) ? c1032e2.f3493e.compareTo(c1032e.f3493e) : Long.compare(c1032e2.billing(), c1032e.billing());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                int ad3 = AbstractC1414e.ad(obj);
                int ad4 = AbstractC1414e.ad(obj2);
                if (ad3 != ad4) {
                    return AbstractC8703e.yandex(ad3, ad4);
                }
                int m2467class = AbstractC8703e.m2467class(ad3);
                if (m2467class == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (m2467class == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (m2467class == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (m2467class == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            default:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
    }
}
