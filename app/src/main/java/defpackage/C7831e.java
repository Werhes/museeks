package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7831e implements InterfaceC18435e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final File f15834e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C7831e f15835e = new C7831e();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final AbstractC13345e f15836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f15837e = AbstractC9743e.vip();

    static {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        f15834e = vKXApplication.getFilesDir();
        C14172e c14172e = VKXApplication.f36533e;
        C5538e c5538e = C5538e.metrica;
        f15836e = AbstractC16704e.ad(c14172e, AbstractC3820e.vip(List.class, AbstractC16704e.license(AbstractC3820e.ad(String.class))));
    }

    public static List ad() {
        List list;
        File file = f15834e;
        try {
            AbstractC13345e abstractC13345e = f15836e;
            File file2 = new File(file, "OrbitSearchHistory.dat");
            if (!file2.exists()) {
                file2.createNewFile();
            }
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file2), AbstractC5508e.ad);
            try {
                StringWriter stringWriter = new StringWriter();
                char[] cArr = new char[8192];
                for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                    stringWriter.write(cArr, 0, read);
                }
                String stringWriter2 = stringWriter.toString();
                inputStreamReader.close();
                list = (List) abstractC13345e.metrica(stringWriter2);
            } finally {
            }
        } catch (Throwable unused) {
            new File(file, "OrbitSearchHistory.dat").delete();
            list = null;
        }
        return list == null ? C13664e.f27089e : list;
    }

    public static void vip(String str) {
        if (ad().contains(str) || AbstractC5304e.m1866native(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(ad());
        arrayList.add(0, str);
        List m3602switch = AbstractC13480e.m3602switch(arrayList, 5);
        File file = new File(f15834e, "OrbitSearchHistory.dat");
        if (!file.exists()) {
            file.createNewFile();
        }
        AbstractC1641e.admob(file, f15836e.appmetrica(m3602switch));
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f15837e.f29359e;
    }
}
