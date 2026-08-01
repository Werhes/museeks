package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Mac;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۥۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2223e implements InterfaceC7218e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2892e f5677e = new C2892e(516498437, false, new C8580e(19));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f5676e = new C2892e(-791105934, false, new C8580e(20));

    public static final void ad(InterfaceC13033e interfaceC13033e) {
        interfaceC13033e.ad(new IOException("Channel was cancelled"));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eٍٕٓ, java.lang.Object, eٌٍٚ] */
    public static final byte[] appmetrica(InterfaceC5372e interfaceC5372e, Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
            try {
                zipOutputStream.setLevel(7);
                zipOutputStream.putNextEntry(new ZipEntry("Entry"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(zipOutputStream, 8192);
                try {
                    C11817e c11817e = AbstractC0952e.ad;
                    ?? obj2 = new Object();
                    obj2.f18968e = bufferedOutputStream;
                    obj2.f18967e = C14534e.metrica.metrica(AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE);
                    obj2.f18969e = C18078e.metrica.license(128);
                    byte[] bArr = (byte[]) obj2.f18967e;
                    try {
                        AbstractC4508e.license(c11817e, obj2, interfaceC5372e, obj);
                        obj2.isPro();
                        C18078e.metrica.vip((char[]) obj2.f18969e);
                        C14534e.metrica.ad(bArr);
                        Unit unit = Unit.INSTANCE;
                        bufferedOutputStream.close();
                        zipOutputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        obj2.isPro();
                        C18078e.metrica.vip((char[]) obj2.f18969e);
                        C14534e.metrica.ad(bArr);
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC16704e.vip(bufferedOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AbstractC16704e.vip(zipOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                AbstractC16704e.vip(byteArrayOutputStream, th6);
                throw th7;
            }
        }
    }

    public static C4983e license(CharSequence charSequence) {
        if (!charSequence.equals("HTTP/1.1")) {
            if (!charSequence.equals("HTTP/1.0")) {
                if (!charSequence.equals("HTTP/2.0")) {
                    if (!charSequence.equals("HTTP/3.0")) {
                        List m1869private = AbstractC5304e.m1869private(charSequence, new String[]{"/", "."}, 6);
                        if (m1869private.size() != 3) {
                            throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) charSequence)).toString());
                        }
                        String str = (String) m1869private.get(0);
                        String str2 = (String) m1869private.get(1);
                        String str3 = (String) m1869private.get(2);
                        int parseInt = Integer.parseInt(str2);
                        int parseInt2 = Integer.parseInt(str3);
                        if (!str.equals("HTTP") || parseInt != 1 || parseInt2 != 0) {
                            if (!str.equals("HTTP") || parseInt != 1 || parseInt2 != 1) {
                                if (!str.equals("HTTP") || parseInt != 2 || parseInt2 != 0) {
                                    if (!str.equals("HTTP") || parseInt != 3 || parseInt2 != 0) {
                                        return new C4983e(str, parseInt, parseInt2);
                                    }
                                }
                            }
                        }
                    }
                    return C4983e.license;
                }
                return C4983e.appmetrica;
            }
            return C4983e.billing;
        }
        return C4983e.purchase;
    }

    public static final Object metrica(InterfaceC5372e interfaceC5372e, byte[] bArr) {
        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(bArr));
        try {
            zipInputStream.getNextEntry();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream, 8192);
            try {
                Object purchase = AbstractC13336e.purchase(AbstractC0952e.ad, interfaceC5372e, bufferedInputStream);
                bufferedInputStream.close();
                zipInputStream.close();
                return purchase;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC16704e.vip(zipInputStream, th);
                throw th2;
            }
        }
    }

    public static InterfaceC7218e vip(C15617e c15617e) {
        C17974e c17974e = c15617e.vip;
        C14186e c14186e = new C14186e(((C15768e) c17974e.f35233e).vip());
        try {
            Provider billing = AbstractC1358e.billing();
            if (billing == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", billing);
            return new C3168e(c14186e, new C5891e(((C15768e) c17974e.f35233e).vip(), billing), 9);
        } catch (GeneralSecurityException unused) {
            return c14186e;
        }
    }
}
