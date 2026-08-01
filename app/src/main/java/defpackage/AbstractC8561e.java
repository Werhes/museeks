package defpackage;

import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8561e {
    public static SharedPreferences ad;
    public static boolean vip;

    public static void ad() {
        if (!vip) {
            throw new RuntimeException("Scrobbler not initialized!");
        }
    }

    public static String metrica(TreeMap treeMap) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append(str);
            sb.append(str2);
        }
        sb.append("c6fd658cbb3e890ad61f1c3f809cb14d");
        try {
            return AbstractC5304e.m1850abstract(32, new BigInteger(1, MessageDigest.getInstance("MD5").digest(sb.toString().getBytes(AbstractC5508e.ad))).toString(16));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String vip(TreeMap treeMap) {
        TreeMap treeMap2 = new TreeMap((Map) treeMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb.length() > 0) {
                sb.append("&");
            }
            try {
                sb.append(URLEncoder.encode(str, "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
