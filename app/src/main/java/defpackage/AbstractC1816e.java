package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1816e implements InterfaceC12385e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC12385e f4899e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f4900e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final HashSet f4898e = new HashSet();

    public AbstractC1816e(InterfaceC12385e interfaceC12385e) {
        this.f4899e = interfaceC12385e;
    }

    public final void ad(InterfaceC4843e interfaceC4843e) {
        synchronized (this.f4900e) {
            this.f4898e.add(interfaceC4843e);
        }
    }

    @Override // defpackage.InterfaceC12385e
    public final Image amazon() {
        return this.f4899e.amazon();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.f4899e.close();
        synchronized (this.f4900e) {
            hashSet = new HashSet(this.f4898e);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC4843e) it.next()).ad(this);
        }
    }

    @Override // defpackage.InterfaceC12385e
    public final int getFormat() {
        return this.f4899e.getFormat();
    }

    @Override // defpackage.InterfaceC12385e
    public int getWidth() {
        return this.f4899e.getWidth();
    }

    @Override // defpackage.InterfaceC12385e
    public InterfaceC15935e[] remoteconfig() {
        return this.f4899e.remoteconfig();
    }

    @Override // defpackage.InterfaceC12385e
    /* renamed from: synchronized, reason: not valid java name */
    public InterfaceC10073e mo691synchronized() {
        return this.f4899e.mo691synchronized();
    }

    @Override // defpackage.InterfaceC12385e
    public int vip() {
        return this.f4899e.vip();
    }
}
