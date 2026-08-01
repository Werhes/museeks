package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4707e implements InterfaceC9998e, InterfaceC15234e {
    public final String ad;
    public final Object adcel;
    public final String[] appmetrica;
    public final boolean[] billing;
    public int license = -1;
    public final int metrica;
    public final Object mopub;
    public final List[] purchase;
    public final Object startapp;
    public final InterfaceC12067e vip;
    public Object yandex;

    public C4707e(String str, InterfaceC12067e interfaceC12067e, int i) {
        this.ad = str;
        this.vip = interfaceC12067e;
        this.metrica = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.appmetrica = strArr;
        int i3 = this.metrica;
        this.purchase = new List[i3];
        this.billing = new boolean[i3];
        this.yandex = C9139e.f18290e;
        final int i4 = 0;
        this.startapp = AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؗٚٙ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4707e f10565e;

            {
                this.f10565e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eؕٛؓ] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                switch (i4) {
                    case 0:
                        InterfaceC12067e interfaceC12067e2 = this.f10565e.vip;
                        return interfaceC12067e2 != null ? interfaceC12067e2.license() : AbstractC0890e.ad;
                    case 1:
                        InterfaceC12067e interfaceC12067e3 = this.f10565e.vip;
                        if (interfaceC12067e3 != null) {
                            InterfaceC5372e[] vip = interfaceC12067e3.vip();
                            arrayList = new ArrayList(vip.length);
                            for (InterfaceC5372e interfaceC5372e : vip) {
                                arrayList.add(interfaceC5372e.appmetrica());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC14161e.vip(arrayList);
                    default:
                        C4707e c4707e = this.f10565e;
                        return Integer.valueOf(AbstractC16619e.appmetrica(c4707e, (InterfaceC9998e[]) c4707e.adcel.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.adcel = AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؗٚٙ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4707e f10565e;

            {
                this.f10565e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eؕٛؓ] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                switch (i5) {
                    case 0:
                        InterfaceC12067e interfaceC12067e2 = this.f10565e.vip;
                        return interfaceC12067e2 != null ? interfaceC12067e2.license() : AbstractC0890e.ad;
                    case 1:
                        InterfaceC12067e interfaceC12067e3 = this.f10565e.vip;
                        if (interfaceC12067e3 != null) {
                            InterfaceC5372e[] vip = interfaceC12067e3.vip();
                            arrayList = new ArrayList(vip.length);
                            for (InterfaceC5372e interfaceC5372e : vip) {
                                arrayList.add(interfaceC5372e.appmetrica());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC14161e.vip(arrayList);
                    default:
                        C4707e c4707e = this.f10565e;
                        return Integer.valueOf(AbstractC16619e.appmetrica(c4707e, (InterfaceC9998e[]) c4707e.adcel.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.mopub = AbstractC18039e.appmetrica(2, new Function0(this) { // from class: eؗٚٙ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4707e f10565e;

            {
                this.f10565e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eؕٛؓ] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList;
                switch (i6) {
                    case 0:
                        InterfaceC12067e interfaceC12067e2 = this.f10565e.vip;
                        return interfaceC12067e2 != null ? interfaceC12067e2.license() : AbstractC0890e.ad;
                    case 1:
                        InterfaceC12067e interfaceC12067e3 = this.f10565e.vip;
                        if (interfaceC12067e3 != null) {
                            InterfaceC5372e[] vip = interfaceC12067e3.vip();
                            arrayList = new ArrayList(vip.length);
                            for (InterfaceC5372e interfaceC5372e : vip) {
                                arrayList.add(interfaceC5372e.appmetrica());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC14161e.vip(arrayList);
                    default:
                        C4707e c4707e = this.f10565e;
                        return Integer.valueOf(AbstractC16619e.appmetrica(c4707e, (InterfaceC9998e[]) c4707e.adcel.getValue()));
                }
            }
        });
    }

    @Override // defpackage.InterfaceC9998e
    public final String ad() {
        return this.ad;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC9998e
    public InterfaceC9998e adcel(int i) {
        return ((InterfaceC5372e[]) this.startapp.getValue())[i].appmetrica();
    }

    public final void advert(String str, boolean z) {
        int i = this.license + 1;
        this.license = i;
        String[] strArr = this.appmetrica;
        strArr[i] = str;
        this.billing[i] = z;
        this.purchase[i] = null;
        if (i == this.metrica - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.yandex = hashMap;
        }
    }

    @Override // defpackage.InterfaceC9998e
    public AbstractC8457e appmetrica() {
        return C6805e.appmetrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final String billing(int i) {
        return this.appmetrica[i];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, eؕٛؓ] */
    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4707e) {
            InterfaceC9998e interfaceC9998e = (InterfaceC9998e) obj;
            if (AbstractC7890e.billing(this.ad, interfaceC9998e.ad()) && Arrays.equals((InterfaceC9998e[]) this.adcel.getValue(), (InterfaceC9998e[]) ((C4707e) obj).adcel.getValue())) {
                int purchase = interfaceC9998e.purchase();
                int i2 = this.metrica;
                if (i2 == purchase) {
                    for (0; i < i2; i + 1) {
                        i = (AbstractC7890e.billing(adcel(i).ad(), interfaceC9998e.adcel(i).ad()) && AbstractC7890e.billing(adcel(i).appmetrica(), interfaceC9998e.adcel(i).appmetrica())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final List getAnnotations() {
        return C13664e.f27089e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    public int hashCode() {
        return ((Number) this.mopub.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.InterfaceC9998e
    public final int license(String str) {
        Integer num = (Integer) this.yandex.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC9998e
    public final boolean mopub(int i) {
        return this.billing[i];
    }

    @Override // defpackage.InterfaceC9998e
    public final int purchase() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC9998e
    public final List startapp(int i) {
        List list = this.purchase[i];
        return list == null ? C13664e.f27089e : list;
    }

    public String toString() {
        return AbstractC16619e.purchase(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.InterfaceC15234e
    public final Set vip() {
        return this.yandex.keySet();
    }

    @Override // defpackage.InterfaceC9998e
    public boolean yandex() {
        return false;
    }
}
