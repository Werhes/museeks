package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17306e {
    public final List ad;
    public List appmetrica;
    public final C5363e billing;
    public List license;
    public final List metrica;
    public final C5363e purchase;
    public final List vip;

    public C17306e(List list, List list2, List list3, List list4, List list5) {
        this.ad = list;
        this.vip = list2;
        this.metrica = list3;
        this.license = list4;
        this.appmetrica = list5;
        final int i = 0;
        this.purchase = new C5363e(new Function0(this) { // from class: eٍؔۘ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17306e f6319e;

            {
                this.f6319e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C17306e c17306e = this.f6319e;
                        List list6 = c17306e.license;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            AbstractC13480e.inmobi(arrayList, (List) ((Function0) list6.get(i2)).invoke());
                        }
                        c17306e.license = C13664e.f27089e;
                        return arrayList;
                    default:
                        C17306e c17306e2 = this.f6319e;
                        List list7 = c17306e2.appmetrica;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            AbstractC13480e.inmobi(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                        }
                        c17306e2.appmetrica = C13664e.f27089e;
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.billing = new C5363e(new Function0(this) { // from class: eٍؔۘ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17306e f6319e;

            {
                this.f6319e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C17306e c17306e = this.f6319e;
                        List list6 = c17306e.license;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i22 = 0; i22 < size; i22++) {
                            AbstractC13480e.inmobi(arrayList, (List) ((Function0) list6.get(i22)).invoke());
                        }
                        c17306e.license = C13664e.f27089e;
                        return arrayList;
                    default:
                        C17306e c17306e2 = this.f6319e;
                        List list7 = c17306e2.appmetrica;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            AbstractC13480e.inmobi(arrayList2, (List) ((Function0) list7.get(i3)).invoke());
                        }
                        c17306e2.appmetrica = C13664e.f27089e;
                        return arrayList2;
                }
            }
        });
    }
}
