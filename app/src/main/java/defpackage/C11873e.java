package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٝۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11873e {
    public final C7911e ad;
    public final C7249e adcel = AbstractC3421e.ad;
    public final int advert;
    public final boolean appmetrica;
    public final InterfaceC6256e billing;
    public final boolean license;
    public final C0398e metrica;
    public final Function1 mopub;
    public final C13823e purchase;
    public final C18343e startapp;
    public final C15860e vip;
    public final C3457e yandex;

    public C11873e(C7911e c7911e, C15860e c15860e, C0398e c0398e, boolean z, boolean z2, C13823e c13823e, InterfaceC6256e interfaceC6256e, C3457e c3457e, C18343e c18343e, Function1 function1, int i) {
        this.ad = c7911e;
        this.vip = c15860e;
        this.metrica = c0398e;
        this.license = z;
        this.appmetrica = z2;
        this.purchase = c13823e;
        this.billing = interfaceC6256e;
        this.yandex = c3457e;
        this.startapp = c18343e;
        this.mopub = function1;
        this.advert = i;
    }

    public final void ad(List list) {
        C16911e c16911e = this.ad.license;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new Object());
        this.mopub.invoke(c16911e.Signature(arrayList));
    }
}
