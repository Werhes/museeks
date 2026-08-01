package defpackage;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1781e extends C1548e {
    public final Hashtable appmetrica;
    public final EnumC6816e license;
    public final C11020e purchase;

    public C1781e(EnumC6816e enumC6816e) {
        super(enumC6816e.f14045e, 0L, BigInteger.ZERO);
        this.appmetrica = new Hashtable();
        this.purchase = new C11020e(new C8905e(BuildConfig.FLAVOR, 0));
        this.license = enumC6816e;
    }

    @Override // defpackage.C1548e
    public String ad(String str) {
        StringBuilder sb = new StringBuilder(super.ad(str));
        Iterator it = appmetrica().iterator();
        while (it.hasNext()) {
            C8905e c8905e = (C8905e) it.next();
            sb.append(str);
            sb.append("  |-> ");
            sb.append(c8905e);
            sb.append(AbstractC12394e.ad);
        }
        return sb.toString();
    }

    public long adcel(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr;
        long license = license();
        ArrayList appmetrica = appmetrica();
        byteArrayOutputStream.write(this.vip.ad());
        AbstractC12394e.startapp(license, byteArrayOutputStream);
        AbstractC12394e.billing(appmetrica.size(), byteArrayOutputStream);
        Iterator it = appmetrica.iterator();
        while (it.hasNext()) {
            C8905e c8905e = (C8905e) it.next();
            String str = c8905e.f17871e;
            EnumC6816e enumC6816e = this.license;
            c8905e.ad(enumC6816e);
            if (c8905e.f17869e == 2) {
                bArr = new byte[enumC6816e == EnumC6816e.EXTENDED_CONTENT ? 4 : 2];
                byte[] bArr2 = c8905e.f17870e;
                bArr[0] = (byte) ((bArr2.length <= 0 || bArr2[0] == 0) ? 0 : 1);
            } else {
                bArr = c8905e.f17870e;
            }
            EnumC6816e enumC6816e2 = EnumC6816e.EXTENDED_CONTENT;
            if (enumC6816e != enumC6816e2) {
                AbstractC12394e.billing(0, byteArrayOutputStream);
                AbstractC12394e.billing(0, byteArrayOutputStream);
            }
            AbstractC12394e.billing((str.length() * 2) + 2, byteArrayOutputStream);
            if (enumC6816e == enumC6816e2) {
                byteArrayOutputStream.write(AbstractC12394e.vip(str, C2637e.billing));
                byteArrayOutputStream.write(C2637e.yandex);
            }
            int i = c8905e.f17869e;
            AbstractC12394e.billing(i, byteArrayOutputStream);
            int length = bArr.length;
            if (i == 0) {
                length += 2;
            }
            if (enumC6816e == enumC6816e2) {
                AbstractC12394e.billing(length, byteArrayOutputStream);
            } else {
                AbstractC12394e.yandex(length, byteArrayOutputStream);
            }
            if (enumC6816e != enumC6816e2) {
                byteArrayOutputStream.write(AbstractC12394e.vip(str, C2637e.billing));
                byteArrayOutputStream.write(C2637e.yandex);
            }
            byteArrayOutputStream.write(bArr);
            if (i == 0) {
                byteArrayOutputStream.write(C2637e.yandex);
            }
        }
        return license;
    }

    public final ArrayList appmetrica() {
        Collection bridge_synchronizedCollection;
        ArrayList arrayList = new ArrayList();
        bridge_synchronizedCollection = DesugarCollections.bridge_synchronizedCollection(r1.values(), this.appmetrica);
        Iterator it = bridge_synchronizedCollection.iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return arrayList;
    }

    public final String billing(String str) {
        ArrayList purchase = purchase(str);
        return !purchase.isEmpty() ? ((C8905e) purchase.get(0)).appmetrica() : BuildConfig.FLAVOR;
    }

    public long license() {
        long j = 26;
        while (appmetrica().iterator().hasNext()) {
            j += ((C8905e) r0.next()).ad(this.license);
        }
        return j;
    }

    public final C8905e metrica(int i, String str) {
        ArrayList purchase = purchase(str);
        if (!purchase.isEmpty()) {
            return (C8905e) purchase.get(0);
        }
        C8905e c8905e = new C8905e(this.license, str, i, 0);
        vip(c8905e);
        return c8905e;
    }

    public final ArrayList purchase(String str) {
        Collection<List> bridge_synchronizedCollection;
        ArrayList arrayList = new ArrayList();
        bridge_synchronizedCollection = DesugarCollections.bridge_synchronizedCollection(r1.values(), this.appmetrica);
        for (List list : bridge_synchronizedCollection) {
            if (!list.isEmpty() && ((C8905e) list.get(0)).f17871e.equals(str)) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public final boolean startapp() {
        if (appmetrica().size() == 0) {
            return true;
        }
        Iterator it = appmetrica().iterator();
        boolean z = true;
        while (z && it.hasNext()) {
            z &= ((C8905e) it.next()).f17870e.length == 0;
        }
        return z;
    }

    public final void vip(C8905e c8905e) {
        List list;
        IllegalArgumentException ad = this.license.ad(c8905e.f17871e, c8905e.license(), c8905e.f17869e);
        if (ad != null) {
            throw ad;
        }
        if (!yandex(c8905e)) {
            throw new IllegalArgumentException("Descriptor cannot be added, see isAddSupported(...)");
        }
        synchronized (this.purchase) {
            Hashtable hashtable = this.appmetrica;
            C11020e c11020e = this.purchase;
            c11020e.ad = c8905e;
            list = (List) hashtable.get(c11020e);
        }
        if (list == null) {
            list = new ArrayList();
            this.appmetrica.put(new C11020e(c8905e), list);
        } else if (!list.isEmpty() && !this.license.f14044e) {
            throw new IllegalArgumentException("Container does not allow multiple values of descriptors with same name, language index and stream number");
        }
        list.add(c8905e);
    }

    public boolean yandex(C8905e c8905e) {
        boolean z = this.license.ad(c8905e.f17871e, c8905e.license(), c8905e.f17869e) == null;
        if (!z || this.license.f14044e) {
            return z;
        }
        synchronized (this.purchase) {
            try {
                Hashtable hashtable = this.appmetrica;
                C11020e c11020e = this.purchase;
                c11020e.ad = c8905e;
                List list = (List) hashtable.get(c11020e);
                if (list != null) {
                    z = list.isEmpty();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
