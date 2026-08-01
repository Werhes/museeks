package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16225e extends AbstractC11463e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f31886e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f31887e = BuildConfig.FLAVOR;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AbstractC16225e) && this.f31886e == ((AbstractC16225e) obj).f31886e;
        }
        return true;
    }

    public abstract byte pro();

    public final boolean vip() {
        return this.f31886e;
    }
}
