package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9460e {
    public static final C2892e ad = new C2892e(-833435756, false, new C5029e(15));
    public static final C2892e vip = new C2892e(-1968334970, false, new C5029e(16));
    public static final C2892e metrica = new C2892e(1119755711, false, new C16015e(7));
    public static final C2892e license = new C2892e(-1788195471, false, new C16015e(8));
    public static final C2892e appmetrica = new C2892e(-440171711, false, new C16015e(9));
    public static final C2892e purchase = new C2892e(-1104447187, false, new C9375e(3));
    public static final C2892e billing = new C2892e(2053161689, false, new C5029e(17));
    public static final C2892e yandex = new C2892e(-1509630152, false, new C5029e(18));
    public static final C2892e startapp = new C2892e(-160166094, false, new C16015e(10));
    public static final C2892e adcel = new C2892e(1304184816, false, new C16015e(11));
    public static final byte[] mopub = new byte[0];

    public static /* synthetic */ void ad(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static C4542e appmetrica(List list, AbstractC3370e abstractC3370e, InterfaceC15498e interfaceC15498e, ArrayList arrayList) {
        if (abstractC3370e == null) {
            ad(1);
            throw null;
        }
        if (interfaceC15498e == null) {
            ad(2);
            throw null;
        }
        if (arrayList == null) {
            ad(3);
            throw null;
        }
        C4542e purchase2 = purchase(list, abstractC3370e, interfaceC15498e, arrayList, null);
        if (purchase2 != null) {
            return purchase2;
        }
        throw new AssertionError("Substitution failed");
    }

    public static int license(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read < 0) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    public static byte[] metrica(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static C4542e purchase(List list, AbstractC3370e abstractC3370e, InterfaceC15498e interfaceC15498e, List list2, boolean[] zArr) {
        if (abstractC3370e == null) {
            ad(6);
            throw null;
        }
        if (interfaceC15498e == null) {
            ad(7);
            throw null;
        }
        if (list2 == null) {
            ad(8);
            throw null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC16046e interfaceC16046e = (InterfaceC16046e) it.next();
            C1428e m605e = C1428e.m605e(interfaceC15498e, interfaceC16046e.getAnnotations(), interfaceC16046e.mo2739e(), interfaceC16046e.mo2738e(), interfaceC16046e.getName(), i, interfaceC16046e.mo2740e());
            hashMap.put(interfaceC16046e.mo1459goto(), new C7878e(1, m605e.mo1458e()));
            hashMap2.put(interfaceC16046e, m605e);
            list2.add(m605e);
            i++;
        }
        C13027e c13027e = new C13027e(1, hashMap);
        C4542e appmetrica2 = C4542e.appmetrica(abstractC3370e, c13027e);
        C4542e appmetrica3 = C4542e.appmetrica(new C12725e(abstractC3370e, 1), c13027e);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC16046e interfaceC16046e2 = (InterfaceC16046e) it2.next();
            C1428e c1428e = (C1428e) hashMap2.get(interfaceC16046e2);
            for (AbstractC1186e abstractC1186e : interfaceC16046e2.getUpperBounds()) {
                InterfaceC4077e advert = abstractC1186e.loadAd().advert();
                AbstractC1186e startapp2 = (((advert instanceof InterfaceC16046e) && AbstractC16279e.startapp((InterfaceC16046e) advert, null, null)) ? appmetrica2 : appmetrica3).startapp(3, abstractC1186e);
                if (startapp2 == null) {
                    return null;
                }
                if (startapp2 != abstractC1186e && zArr != null) {
                    zArr[0] = true;
                }
                if (c1428e.f4258e) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + c1428e.m608e());
                }
                if (!AbstractC4520e.purchase(startapp2)) {
                    c1428e.f4259e.add(startapp2);
                }
            }
            if (c1428e.f4258e) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + c1428e.m608e());
            }
            c1428e.f4258e = true;
        }
        return appmetrica2;
    }

    public static C3847e vip(C10068e c10068e, C11913e c11913e) {
        List list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list2 = c11913e.ad;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            AbstractC8835e abstractC8835e = (AbstractC8835e) list2.get(i);
            List list3 = abstractC8835e.ad;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((abstractC8835e instanceof C2089e) && i2 == list3.size() / 2) {
                    arrayList2.add(new C6571e(abstractC8835e, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list3.get(i2));
            }
        }
        Float valueOf = Float.valueOf(0.0f);
        int subscription = AbstractC0746e.subscription(arrayList, 9);
        if (subscription == 0) {
            list = Collections.singletonList(valueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(subscription + 1);
            arrayList3.add(valueOf);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C4211e c4211e = (C4211e) it.next();
                float floatValue = valueOf.floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (C10068e.appmetrica(c4211e, Float.POSITIVE_INFINITY) & 4294967295L));
                if (intBitsToFloat < 0.0f) {
                    throw new IllegalArgumentException("Measured cubic is expected to be greater or equal to zero");
                }
                Unit unit = Unit.INSTANCE;
                valueOf = Float.valueOf(floatValue + intBitsToFloat);
                arrayList3.add(valueOf);
            }
            list = arrayList3;
        }
        float floatValue2 = ((Number) AbstractC13480e.m3570break(list)).floatValue();
        C1543e c1543e = new C1543e(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            c1543e.ad(((Number) list.get(i3)).floatValue() / floatValue2);
        }
        C1169e license2 = AbstractC6874e.license();
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            int intValue = ((Number) ((C6571e) arrayList2.get(i4)).f13543e).intValue();
            license2.add(new C5573e(AbstractC4424e.metrica((c1543e.vip(intValue + 1) + c1543e.vip(intValue)) / 2), (AbstractC8835e) ((C6571e) arrayList2.get(i4)).f13544e));
        }
        return new C3847e(c10068e, AbstractC6874e.metrica(license2), arrayList, c1543e);
    }
}
