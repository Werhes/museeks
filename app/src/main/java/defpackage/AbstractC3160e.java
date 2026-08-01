package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3160e implements InterfaceC15954e, Serializable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f7264e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Class f7265e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f7266e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f7267e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public transient InterfaceC15954e f7268e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f7269e;

    public AbstractC3160e(Object obj, Class cls, String str, String str2, boolean z) {
        this.f7266e = obj;
        this.f7265e = cls;
        this.f7267e = str;
        this.f7264e = str2;
        this.f7269e = z;
    }

    @Override // defpackage.InterfaceC15954e
    public final Object Signature(Map map) {
        return admob().Signature(map);
    }

    public InterfaceC15954e adcel() {
        InterfaceC15954e interfaceC15954e = this.f7268e;
        if (interfaceC15954e != null) {
            return interfaceC15954e;
        }
        InterfaceC15954e advert = advert();
        this.f7268e = advert;
        return advert;
    }

    public InterfaceC15954e admob() {
        InterfaceC15954e adcel = adcel();
        if (adcel != this) {
            return adcel;
        }
        throw new C10928e();
    }

    @Override // defpackage.InterfaceC15954e
    public final boolean ads() {
        return admob().ads();
    }

    public abstract InterfaceC15954e advert();

    public final InterfaceC7329e amazon() {
        Class cls = this.f7265e;
        if (cls == null) {
            return null;
        }
        return this.f7269e ? AbstractC3820e.ad.metrica(cls) : AbstractC3820e.ad.vip(cls);
    }

    @Override // defpackage.InterfaceC15954e
    public final String getName() {
        return this.f7267e;
    }

    @Override // defpackage.InterfaceC15954e
    public final List getParameters() {
        return admob().getParameters();
    }

    @Override // defpackage.InterfaceC15954e
    public final List getTypeParameters() {
        return admob().getTypeParameters();
    }

    @Override // defpackage.InterfaceC15954e
    public final InterfaceC13984e inmobi() {
        return admob().inmobi();
    }

    @Override // defpackage.InterfaceC15954e
    public boolean tapsense() {
        return admob().tapsense();
    }
}
