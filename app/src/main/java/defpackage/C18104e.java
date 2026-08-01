package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۤؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18104e implements InterfaceC17242e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Function1 appmetrica;
    public final /* synthetic */ Function1 license;
    public final /* synthetic */ Map metrica;
    public final /* synthetic */ AbstractC9292e purchase;
    public final /* synthetic */ int vip;

    public C18104e(int i, int i2, Map map, Function1 function1, Function1 function12, AbstractC9292e abstractC9292e) {
        this.ad = i;
        this.vip = i2;
        this.metrica = map;
        this.license = function1;
        this.appmetrica = function12;
        this.purchase = abstractC9292e;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        return this.license;
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        this.appmetrica.invoke(this.purchase.f18510e);
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        return this.vip;
    }
}
