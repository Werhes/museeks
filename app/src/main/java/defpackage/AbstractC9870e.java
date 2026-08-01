package defpackage;

import androidx.recyclerview.widget.startapp;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9870e extends AbstractC3655e implements InterfaceC18435e {

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f19475e = AbstractC9743e.vip();

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final String f19476e = BuildConfig.FLAVOR;

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f19475e.f29359e;
    }

    @Override // defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        AbstractC9743e.license(this, null);
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: break */
    public String mo1348break() {
        return this.f19476e;
    }

    /* renamed from: else */
    public abstract Object mo1405else(List list, InterfaceC5083e interfaceC5083e);

    @Override // defpackage.AbstractC3655e
    /* renamed from: private */
    public final void mo1391private(int i) {
        if (this.f8224e) {
            return;
        }
        this.f8224e = true;
        AbstractC5336e.purchase(this, new C6727e(this), 0, new C8699e(this, i, null, 1), 2);
    }

    /* renamed from: return */
    public abstract Object mo215return(int i, InterfaceC5083e interfaceC5083e);

    /* renamed from: synchronized, reason: not valid java name */
    public final C17199e m2742synchronized() {
        startapp startappVar = this.f8233e;
        if (startappVar == null) {
            startappVar = null;
        }
        return (C17199e) startappVar;
    }
}
