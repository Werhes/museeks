package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17916e extends AbstractC1029e {
    public static final C1962e remoteconfig;
    public int Signature;
    public long[][] admob;
    public final ArrayList advert;
    public final ArrayList amazon;
    public final C1400e loadAd;
    public final AbstractC3317e[] mopub;
    public final AbstractC6690e[] smaato;
    public C13593e subscription;

    /* JADX WARN: Type inference failed for: r4v0, types: [eٌّؒ, eٔؐۜ] */
    static {
        C9466e c9466e = new C9466e();
        C2171e c2171e = AbstractC17475e.f34223e;
        C1410e c1410e = C1410e.f4222e;
        List list = Collections.EMPTY_LIST;
        C1410e c1410e2 = C1410e.f4222e;
        C9457e c9457e = new C9457e();
        remoteconfig = new C1962e("MergingMediaSource", new C14435e(c9466e), null, new C15197e(c9457e), C12053e.f24142throw, C13325e.license);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [eؚۘٔ, eٕؓۥ] */
    public C17916e(AbstractC3317e... abstractC3317eArr) {
        C1400e c1400e = new C1400e(27);
        this.mopub = abstractC3317eArr;
        this.loadAd = c1400e;
        this.amazon = new ArrayList(Arrays.asList(abstractC3317eArr));
        this.Signature = -1;
        this.advert = new ArrayList(abstractC3317eArr.length);
        for (int i = 0; i < abstractC3317eArr.length; i++) {
            this.advert.add(new ArrayList());
        }
        this.smaato = new AbstractC6690e[abstractC3317eArr.length];
        this.admob = new long[0];
        new HashMap();
        AbstractC17595e.metrica(8, "expectedKeys");
        AbstractC17595e.metrica(2, "expectedValuesPerKey");
        new AbstractC1837e(C3638e.vip(8)).f15163e = new C2856e();
    }

    @Override // defpackage.AbstractC1029e, defpackage.AbstractC3317e
    public final void Signature() {
        super.Signature();
        Arrays.fill(this.smaato, (Object) null);
        this.Signature = -1;
        this.subscription = null;
        ArrayList arrayList = this.amazon;
        arrayList.clear();
        Collections.addAll(arrayList, this.mopub);
    }

    @Override // defpackage.AbstractC3317e
    public final boolean ad(C1962e c1962e) {
        AbstractC3317e[] abstractC3317eArr = this.mopub;
        return abstractC3317eArr.length > 0 && abstractC3317eArr[0].ad(c1962e);
    }

    @Override // defpackage.AbstractC1029e, defpackage.AbstractC3317e
    public final void adcel() {
        C13593e c13593e = this.subscription;
        if (c13593e != null) {
            throw c13593e;
        }
        super.adcel();
    }

    @Override // defpackage.AbstractC3317e
    public final void advert(InterfaceC4407e interfaceC4407e) {
        this.adcel = interfaceC4407e;
        this.startapp = AbstractC9413e.subscription(null);
        int i = 0;
        while (true) {
            AbstractC3317e[] abstractC3317eArr = this.mopub;
            if (i >= abstractC3317eArr.length) {
                return;
            }
            inmobi(Integer.valueOf(i), abstractC3317eArr[i]);
            i++;
        }
    }

    @Override // defpackage.AbstractC3317e
    public final void amazon(InterfaceC14239e interfaceC14239e) {
        C18057e c18057e = (C18057e) interfaceC14239e;
        int i = 0;
        while (true) {
            AbstractC3317e[] abstractC3317eArr = this.mopub;
            if (i >= abstractC3317eArr.length) {
                return;
            }
            List list = (List) this.advert.get(i);
            InterfaceC14239e[] interfaceC14239eArr = c18057e.f35418e;
            boolean[] zArr = c18057e.f35414e;
            InterfaceC14239e interfaceC14239e2 = zArr[i] ? ((C14852e) interfaceC14239eArr[i]).f29395e : interfaceC14239eArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((C16677e) list.get(i2)).vip.equals(interfaceC14239e2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            AbstractC3317e abstractC3317e = abstractC3317eArr[i];
            InterfaceC14239e[] interfaceC14239eArr2 = c18057e.f35418e;
            abstractC3317e.amazon(zArr[i] ? ((C14852e) interfaceC14239eArr2[i]).f29395e : interfaceC14239eArr2[i]);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [eْۣۖ, java.io.IOException] */
    @Override // defpackage.AbstractC1029e
    public final void isVip(Object obj, AbstractC3317e abstractC3317e, AbstractC6690e abstractC6690e) {
        Integer num = (Integer) obj;
        if (this.subscription != null) {
            return;
        }
        if (this.Signature == -1) {
            this.Signature = abstractC6690e.yandex();
        } else if (abstractC6690e.yandex() != this.Signature) {
            this.subscription = new IOException();
            return;
        }
        int length = this.admob.length;
        AbstractC6690e[] abstractC6690eArr = this.smaato;
        if (length == 0) {
            this.admob = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.Signature, abstractC6690eArr.length);
        }
        ArrayList arrayList = this.amazon;
        arrayList.remove(abstractC3317e);
        abstractC6690eArr[num.intValue()] = abstractC6690e;
        if (arrayList.isEmpty()) {
            smaato(abstractC6690eArr[0]);
        }
    }

    @Override // defpackage.AbstractC1029e
    public final C18208e pro(Object obj, C18208e c18208e) {
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.advert;
        List list = (List) arrayList.get(intValue);
        for (int i = 0; i < list.size(); i++) {
            if (((C16677e) list.get(i)).ad.equals(c18208e)) {
                return ((C16677e) ((List) arrayList.get(0)).get(i)).ad;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC3317e
    public final void remoteconfig(C1962e c1962e) {
        this.mopub[0].remoteconfig(c1962e);
    }

    @Override // defpackage.AbstractC3317e
    public final InterfaceC14239e vip(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        AbstractC3317e[] abstractC3317eArr = this.mopub;
        int length = abstractC3317eArr.length;
        InterfaceC14239e[] interfaceC14239eArr = new InterfaceC14239e[length];
        AbstractC6690e[] abstractC6690eArr = this.smaato;
        int vip = abstractC6690eArr[0].vip(c18208e.ad);
        for (int i = 0; i < length; i++) {
            C18208e ad = c18208e.ad(abstractC6690eArr[i].advert(vip));
            interfaceC14239eArr[i] = abstractC3317eArr[i].vip(ad, interfaceC16970e, j - this.admob[vip][i]);
            ((List) this.advert.get(i)).add(new C16677e(ad, interfaceC14239eArr[i]));
        }
        return new C18057e(this.loadAd, this.admob[vip], interfaceC14239eArr);
    }

    @Override // defpackage.AbstractC3317e
    public final C1962e yandex() {
        AbstractC3317e[] abstractC3317eArr = this.mopub;
        return abstractC3317eArr.length > 0 ? abstractC3317eArr[0].yandex() : remoteconfig;
    }
}
