package defpackage;

import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8769e {
    public static final long[] ad = new long[0];

    public static C11913e ad(int i) {
        int i2 = (i & 1) != 0 ? 8 : 10;
        float f = i2;
        float cos = 1.0f / ((float) Math.cos(AbstractC4424e.vip / f));
        C17307e c17307e = new C17307e(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long isVip = AbstractC11613e.isVip(AbstractC4424e.license(cos, (AbstractC4424e.vip / f) * 2 * i4), C9268e.ad(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = AbstractC11613e.Signature(isVip);
            i3 += 2;
            fArr[i5] = AbstractC11613e.admob(isVip);
        }
        return AbstractC4465e.metrica(fArr, c17307e, null, 0.0f, 0.0f);
    }

    public static InterfaceC8850e appmetrica(InterfaceC4595e interfaceC4595e, InterfaceC1598e interfaceC1598e) {
        return AbstractC7890e.billing(interfaceC4595e.getKey(), interfaceC1598e) ? C2693e.f6576e : interfaceC4595e;
    }

    public static /* synthetic */ String billing(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public static final String license(List list) {
        Object next;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i = ((CustomCatalogBlockItemPhoto) next).metrica;
                do {
                    Object next2 = it.next();
                    int i2 = ((CustomCatalogBlockItemPhoto) next2).metrica;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) next;
        String str = customCatalogBlockItemPhoto != null ? customCatalogBlockItemPhoto.vip : null;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public static final String metrica(int i, List list) {
        Object obj;
        String str;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CustomCatalogBlockItemPhoto) obj).metrica >= i) {
                break;
            }
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto = (CustomCatalogBlockItemPhoto) obj;
        if (customCatalogBlockItemPhoto != null && (str = customCatalogBlockItemPhoto.vip) != null) {
            return str;
        }
        CustomCatalogBlockItemPhoto customCatalogBlockItemPhoto2 = (CustomCatalogBlockItemPhoto) AbstractC13480e.m3604this(list);
        String str2 = customCatalogBlockItemPhoto2 != null ? customCatalogBlockItemPhoto2.vip : null;
        return str2 == null ? BuildConfig.FLAVOR : str2;
    }

    public static C11913e purchase(int i, C17307e c17307e) {
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = AbstractC4424e.vip / i;
            long license = AbstractC4424e.license(1.0f, 2 * f * i3);
            fArr[i2] = AbstractC11613e.Signature(license) + 0.0f;
            fArr[i2 + 1] = AbstractC11613e.admob(license) + 0.0f;
            long license2 = AbstractC4424e.license(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = AbstractC11613e.Signature(license2) + 0.0f;
            i2 += 4;
            fArr[i4] = AbstractC11613e.admob(license2) + 0.0f;
        }
        return AbstractC4465e.metrica(fArr, c17307e, null, 0.0f, 0.0f);
    }

    public static InterfaceC4595e vip(InterfaceC4595e interfaceC4595e, InterfaceC1598e interfaceC1598e) {
        if (AbstractC7890e.billing(interfaceC4595e.getKey(), interfaceC1598e)) {
            return interfaceC4595e;
        }
        return null;
    }
}
