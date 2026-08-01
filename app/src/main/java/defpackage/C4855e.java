package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٜؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4855e implements InterfaceC17242e {
    public final int ad;
    public final /* synthetic */ C11277e appmetrica;
    public final /* synthetic */ Function1 license;
    public final Function1 metrica;
    public final int vip;

    public C4855e(int i, int i2, Function1 function1, Function1 function12, C11277e c11277e) {
        this.license = function12;
        this.appmetrica = c11277e;
        this.ad = i;
        this.vip = i2;
        this.metrica = function1;
    }

    @Override // defpackage.InterfaceC17242e
    public final Map ad() {
        return C9139e.f18290e;
    }

    @Override // defpackage.InterfaceC17242e
    public final int getWidth() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC17242e
    public final Function1 license() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC17242e
    public final void metrica() {
        this.license.invoke(this.appmetrica.f22656e.f18510e);
    }

    @Override // defpackage.InterfaceC17242e
    public final int vip() {
        return this.vip;
    }
}
