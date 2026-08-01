package defpackage;

import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10112e implements InterfaceC14651e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f19985e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f19986e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f19987e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f19988e;

    public C10112e(long j, List list) {
        this.f19988e = list.size() - 1;
        this.f19987e = j;
        this.f19985e = list;
    }

    @Override // defpackage.InterfaceC14651e
    public final long loadAd() {
        long j = this.f19986e;
        if (j < 0 || j > this.f19988e) {
            throw new NoSuchElementException();
        }
        AbstractC18065e abstractC18065e = (AbstractC18065e) this.f19985e.get((int) j);
        return this.f19987e + abstractC18065e.f35427e + abstractC18065e.f35428e;
    }

    @Override // defpackage.InterfaceC14651e
    public final long mopub() {
        long j = this.f19986e;
        if (j < 0 || j > this.f19988e) {
            throw new NoSuchElementException();
        }
        return this.f19987e + ((AbstractC18065e) this.f19985e.get((int) j)).f35427e;
    }

    @Override // defpackage.InterfaceC14651e
    public final boolean next() {
        long j = this.f19986e + 1;
        this.f19986e = j;
        return !(j > this.f19988e);
    }
}
