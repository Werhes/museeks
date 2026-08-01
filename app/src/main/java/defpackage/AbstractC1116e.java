package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1116e implements InterfaceC4023e {
    public final List[] appmetrica;
    public final int[] billing;
    public final String[] license;
    public final boolean metrica;
    public final int purchase;
    public final int[] yandex;

    public AbstractC1116e(Map map, boolean z) {
        this.metrica = z;
        if (map.isEmpty()) {
            this.purchase = 0;
            this.license = new String[0];
            this.appmetrica = new List[0];
            this.billing = new int[0];
            this.yandex = new int[0];
            return;
        }
        if (!z) {
            int size = map.size();
            this.purchase = size;
            this.license = new String[size];
            this.appmetrica = new List[size];
            int startapp = C11672e.startapp(size);
            int[] iArr = new int[startapp];
            for (int i = 0; i < startapp; i++) {
                iArr[i] = -1;
            }
            this.billing = iArr;
            int i2 = this.purchase;
            int[] iArr2 = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr2[i3] = -1;
            }
            this.yandex = iArr2;
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                this.license[i4] = str;
                List[] listArr = this.appmetrica;
                int size2 = list.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.add((String) list.get(i5));
                }
                listArr[i4] = arrayList;
                int ad = ad(str) & (startapp - 1);
                int[] iArr3 = this.yandex;
                int[] iArr4 = this.billing;
                iArr3[i4] = iArr4[ad];
                iArr4[ad] = i4;
                i4++;
            }
            return;
        }
        C0895e c0895e = new C0895e();
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            List list2 = (List) entry2.getValue();
            List list3 = (List) c0895e.get(str2);
            if (list3 != null) {
                c0895e.put(AbstractC13480e.m3584final(list3, list2), str2);
            } else {
                c0895e.put(list2, str2);
            }
        }
        int i6 = c0895e.f3290e;
        this.purchase = i6;
        this.license = new String[i6];
        this.appmetrica = new List[i6];
        int startapp2 = C11672e.startapp(i6);
        int[] iArr5 = new int[startapp2];
        for (int i7 = 0; i7 < startapp2; i7++) {
            iArr5[i7] = -1;
        }
        this.billing = iArr5;
        int i8 = this.purchase;
        int[] iArr6 = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr6[i9] = -1;
        }
        this.yandex = iArr6;
        Iterator it = ((C3131e) c0895e.entrySet()).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            String str3 = (String) entry3.getKey();
            List list4 = (List) entry3.getValue();
            this.license[i10] = str3;
            List[] listArr2 = this.appmetrica;
            int size3 = list4.size();
            ArrayList arrayList2 = new ArrayList(size3);
            for (int i11 = 0; i11 < size3; i11++) {
                arrayList2.add((String) list4.get(i11));
            }
            listArr2[i10] = arrayList2;
            int ad2 = ad(str3) & (startapp2 - 1);
            int[] iArr7 = this.yandex;
            int[] iArr8 = this.billing;
            iArr7[i10] = iArr8[ad2];
            iArr8[ad2] = i10;
            i10++;
        }
    }

    public final int ad(String str) {
        if (!this.metrica) {
            return str.hashCode();
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + Character.toLowerCase(str.charAt(i2));
        }
        return i;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: const */
    public final boolean mo456const() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean contains(String str) {
        return vip(str) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4023e)) {
            return false;
        }
        InterfaceC4023e interfaceC4023e = (InterfaceC4023e) obj;
        if (this.metrica != interfaceC4023e.mo456const()) {
            return false;
        }
        return mopub().equals(interfaceC4023e.mopub());
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍۢؒ */
    public final List mo457e(String str) {
        return vip(str);
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eُۘٙ */
    public final Set mo458e() {
        int i = this.purchase;
        if (i == 0) {
            return C3295e.f7451e;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < i; i2++) {
            linkedHashSet.add(this.license[i2]);
        }
        return linkedHashSet;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eؙِۡ */
    public final String mo459e(String str) {
        List vip = vip(str);
        if (vip != null) {
            return (String) AbstractC13480e.m3604this(vip);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4023e
    /* renamed from: eٍٓۢ */
    public final void mo460e(Function2 function2) {
        for (int i = 0; i < this.purchase; i++) {
            function2.invoke(this.license[i], this.appmetrica[i]);
        }
    }

    public final int hashCode() {
        return mopub().hashCode() + ((this.metrica ? 1231 : 1237) * 961);
    }

    @Override // defpackage.InterfaceC4023e
    public final boolean isEmpty() {
        return this.purchase == 0;
    }

    @Override // defpackage.InterfaceC4023e
    public final Set mopub() {
        int i = this.purchase;
        if (i == 0) {
            return C3295e.f7451e;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i2 = 0; i2 < i; i2++) {
            linkedHashSet.add(new C9239e(this.license[i2], this.appmetrica[i2]));
        }
        return linkedHashSet;
    }

    public final List vip(String str) {
        if (this.purchase == 0) {
            return null;
        }
        int ad = ad(str);
        int i = this.billing[ad & (r1.length - 1)];
        while (i >= 0) {
            if (AbstractC6507e.loadAd(this.license[i], str, this.metrica)) {
                return this.appmetrica[i];
            }
            i = this.yandex[i];
        }
        return null;
    }
}
