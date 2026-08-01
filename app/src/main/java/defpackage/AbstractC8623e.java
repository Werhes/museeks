package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8623e {
    public volatile AbstractC12614e ad;
    public volatile AbstractC12614e metrica;
    public volatile AbstractC12614e vip;

    public final boolean ad(String str) {
        if (this.metrica == null) {
            synchronized (this) {
                try {
                    if (this.metrica == null) {
                        this.metrica = license();
                    }
                } finally {
                }
            }
        }
        return this.metrica.contains(str);
    }

    public abstract AbstractC12614e appmetrica();

    public abstract AbstractC12614e license();

    public final boolean metrica(String str) {
        if (this.ad == null) {
            synchronized (this) {
                try {
                    if (this.ad == null) {
                        this.ad = purchase();
                    }
                } finally {
                }
            }
        }
        return this.ad.contains(str);
    }

    public abstract AbstractC12614e purchase();

    public final boolean vip(String str) {
        if (this.vip == null) {
            synchronized (this) {
                try {
                    if (this.vip == null) {
                        this.vip = appmetrica();
                    }
                } finally {
                }
            }
        }
        return this.vip.contains(str);
    }
}
