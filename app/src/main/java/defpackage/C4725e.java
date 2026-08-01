package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Queue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4725e implements InterfaceC4911e, Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Queue f10111e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C16033e f10112e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eُُٝ] */
    public final void Signature(int i, Object[] objArr) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.ad = i;
        obj.vip = this.f10112e;
        Thread.currentThread().getName();
        obj.metrica = objArr;
        this.f10111e.add(obj);
    }

    @Override // defpackage.InterfaceC4911e
    public final void ad(Object obj) {
        Signature(4, new Object[]{obj});
    }

    @Override // defpackage.InterfaceC4911e
    public final void adcel(String str, Throwable th) {
        Signature(4, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final void advert(Exception exc) {
        Signature(2, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final void amazon(String str) {
        Signature(5, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean appmetrica() {
        return true;
    }

    @Override // defpackage.InterfaceC4911e
    public final void billing(String str) {
        Signature(4, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final void license(String str, Throwable th) {
        Signature(1, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final /* synthetic */ boolean loadAd(int i) {
        return AbstractC5087e.startapp(this, i);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean metrica() {
        return true;
    }

    @Override // defpackage.InterfaceC4911e
    public final void mopub(String str) {
        Signature(3, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean purchase() {
        return true;
    }

    @Override // defpackage.InterfaceC4911e
    public final void smaato(String str) {
        Signature(2, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final void startapp(String str, IOException iOException) {
        Signature(5, null);
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean vip() {
        return true;
    }

    @Override // defpackage.InterfaceC4911e
    public final boolean yandex() {
        return true;
    }
}
