package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4479e implements InterfaceC10625e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C17169e f9689e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17931e f9690e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Inflater f9692e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1292e f9693e = new C1292e();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1292e f9691e = new C1292e();

    static {
        C2171e c2171e = AbstractC17475e.f34223e;
        f9689e = new C17169e(-9223372036854775807L, -9223372036854775807L, C1410e.f4222e);
    }

    public C4479e(List list) {
        int i;
        C17931e c17931e = new C17931e();
        this.f9690e = c17931e;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = AbstractC9413e.ad;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                c17931e.purchase = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = c17931e.purchase;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        AbstractC2803e.amazon("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    AbstractC2803e.smaato("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        c17931e.billing = Integer.parseInt(split2[0]);
                        c17931e.yandex = Integer.parseInt(split2[1]);
                        c17931e.license = true;
                    } catch (RuntimeException e2) {
                        AbstractC2803e.amazon("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC10625e
    public final /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public final /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:76:0x00bd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0286  */
    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo825transient(byte[] r27, int r28, int r29, defpackage.C14033e r30, defpackage.InterfaceC8427e r31) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4479e.mo825transient(byte[], int, int, eٓٗۢ, eٌؑۘ):void");
    }
}
