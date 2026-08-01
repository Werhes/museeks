package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18098e extends AbstractC6547e implements InterfaceC18321e, InterfaceC6472e {
    public List startapp = new ArrayList();
    public HashSet adcel = null;
    public String mopub = null;
    public HashSet advert = null;
    public HashSet smaato = null;

    @Override // defpackage.InterfaceC6472e
    public final Set ad() {
        return null;
    }

    @Override // defpackage.InterfaceC6472e
    public final void adcel(HashSet hashSet) {
    }

    @Override // defpackage.InterfaceC6472e
    public final Set advert() {
        return this.advert;
    }

    public void appmetrica(AbstractC16408e abstractC16408e) {
        this.startapp.add(abstractC16408e);
    }

    @Override // defpackage.InterfaceC6472e
    public final void billing(HashSet hashSet) {
        this.smaato = hashSet;
    }

    @Override // defpackage.InterfaceC18321e
    public final List getChildren() {
        return this.startapp;
    }

    @Override // defpackage.InterfaceC6472e
    public final void license(HashSet hashSet) {
        this.adcel = hashSet;
    }

    @Override // defpackage.InterfaceC6472e
    public final Set purchase() {
        return this.adcel;
    }

    @Override // defpackage.InterfaceC6472e
    public final Set smaato() {
        return this.smaato;
    }

    @Override // defpackage.InterfaceC6472e
    public final void startapp(HashSet hashSet) {
        this.advert = hashSet;
    }

    @Override // defpackage.InterfaceC6472e
    public final String vip() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC6472e
    public final void yandex(String str) {
        this.mopub = str;
    }
}
