package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7679e {
    public String ad;
    public long appmetrica;
    public String billing;
    public String license;
    public String metrica;
    public long purchase;
    public int vip;
    public byte yandex;

    public final C0100e ad() {
        if (this.yandex == 3 && this.vip != 0) {
            return new C0100e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing);
        }
        StringBuilder sb = new StringBuilder();
        if (this.vip == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.yandex & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.yandex & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
