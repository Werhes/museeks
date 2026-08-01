package defpackage;

import android.graphics.Matrix;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1601e extends AbstractC6547e implements InterfaceC4644e, InterfaceC6472e {
    public Matrix amazon;
    public HashSet startapp = null;
    public String adcel = null;
    public HashSet mopub = null;
    public HashSet advert = null;
    public HashSet smaato = null;

    @Override // defpackage.InterfaceC6472e
    public final Set ad() {
        return this.mopub;
    }

    @Override // defpackage.InterfaceC6472e
    public final void adcel(HashSet hashSet) {
        this.mopub = hashSet;
    }

    @Override // defpackage.InterfaceC6472e
    public final Set advert() {
        return this.advert;
    }

    @Override // defpackage.InterfaceC6472e
    public final void billing(HashSet hashSet) {
        this.smaato = hashSet;
    }

    @Override // defpackage.InterfaceC6472e
    public final void license(HashSet hashSet) {
        this.startapp = hashSet;
    }

    @Override // defpackage.InterfaceC4644e
    public final void mopub(Matrix matrix) {
        this.amazon = matrix;
    }

    @Override // defpackage.InterfaceC6472e
    public final Set purchase() {
        return this.startapp;
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
        return this.adcel;
    }

    @Override // defpackage.InterfaceC6472e
    public final void yandex(String str) {
        this.adcel = str;
    }
}
