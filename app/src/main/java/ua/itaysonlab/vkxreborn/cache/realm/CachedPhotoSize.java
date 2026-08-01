package com.werhes.museeksreborn.cache.realm;

import defpackage.AbstractC10064e;
import defpackage.AbstractC15792e;
import defpackage.AbstractC15871e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC6762e;
import defpackage.AbstractC6874e;
import defpackage.AbstractC7890e;
import defpackage.C11974e;
import defpackage.C12232e;
import defpackage.C12575e;
import defpackage.C13655e;
import defpackage.C14294e;
import defpackage.C18234e;
import defpackage.C3869e;
import defpackage.C3968e;
import defpackage.C6196e;
import defpackage.C6571e;
import defpackage.C7290e;
import defpackage.InterfaceC0662e;
import defpackage.InterfaceC10518e;
import defpackage.InterfaceC14287e;
import defpackage.InterfaceC17544e;
import defpackage.InterfaceC3055e;
import defpackage.InterfaceC7227e;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPhotoSize;", "Le٘ؕۚ;", "<init>", "()V", "Companion", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public class CachedPhotoSize implements InterfaceC17544e, InterfaceC10518e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Object f36602e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final int f36603e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final String f36604e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final InterfaceC7227e f36605e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C13655e f36606e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f36607e = BuildConfig.FLAVOR;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f36608e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f36609e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f36610e;

    /* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lua/itaysonlab/vkxreborn/cache/realm/CachedPhotoSize$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion implements InterfaceC3055e {
        private Companion() {
        }

        public /* synthetic */ Companion(int i) {
            this();
        }

        @Override // defpackage.InterfaceC3055e
        public final String ad() {
            return CachedPhotoSize.f36604e;
        }

        @Override // defpackage.InterfaceC3055e
        public final C11974e appmetrica() {
            return new C11974e(new C18234e("CachedPhotoSize", BuildConfig.FLAVOR, 4L, 0L, AbstractC15871e.metrica(), 0), AbstractC6874e.startapp(AbstractC6762e.metrica("width", 1, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("height", 1, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("url", 3, 1, null, BuildConfig.FLAVOR, false, false, false), AbstractC6762e.metrica("type", 3, 1, null, BuildConfig.FLAVOR, true, false, false)));
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC0662e billing() {
            Companion companion = CachedPhotoSize.INSTANCE;
            return null;
        }

        @Override // defpackage.InterfaceC3055e
        public final int license() {
            return CachedPhotoSize.f36603e;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
        @Override // defpackage.InterfaceC3055e
        public final Map metrica() {
            return CachedPhotoSize.f36602e;
        }

        @Override // defpackage.InterfaceC3055e
        public final Object purchase() {
            return new CachedPhotoSize();
        }

        @Override // defpackage.InterfaceC3055e
        public final InterfaceC7227e vip() {
            return CachedPhotoSize.f36605e;
        }
    }

    static {
        C12232e c12232e = AbstractC3820e.ad;
        f36605e = c12232e.vip(CachedPhotoSize.class);
        f36604e = "CachedPhotoSize";
        Class cls = Integer.TYPE;
        f36602e = AbstractC10064e.purchase(new C6571e("width", new C6571e(c12232e.vip(cls), C6196e.f12965e)), new C6571e("height", new C6571e(c12232e.vip(cls), C3869e.f8703e)), new C6571e("url", new C6571e(c12232e.vip(String.class), C3968e.f8853e)), new C6571e("type", new C6571e(c12232e.vip(String.class), C14294e.f28271e)));
        f36603e = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
            if (C7290e.yandex(interfaceC14287e) && C7290e.startapp(this) == C7290e.startapp(interfaceC14287e)) {
                return AbstractC7890e.billing(AbstractC15792e.startapp(this), AbstractC15792e.startapp(interfaceC14287e));
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12575e.ads(this);
    }

    @Override // defpackage.InterfaceC10518e
    public final void isVip(C13655e c13655e) {
        this.f36606e = c13655e;
    }

    @Override // defpackage.InterfaceC10518e
    /* renamed from: premium, reason: from getter */
    public final C13655e getF27457e() {
        return this.f36606e;
    }

    public final String toString() {
        return C12575e.premium(this);
    }
}
