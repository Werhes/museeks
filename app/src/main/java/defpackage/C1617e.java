package defpackage;

/* renamed from: eؚؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1617e {
    public final /* synthetic */ int ad;

    public static void ad(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }
}
