package defpackage;

import android.content.ActivityNotFoundException;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۤؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18467e {
    public static final C2443e ad = new C2443e("NULL", 2);
    public static final C2443e vip = new C2443e("UNINITIALIZED", 2);
    public static final C2443e metrica = new C2443e("DONE", 2);

    public static C2362e ad(String str) {
        AbstractC12699e abstractC12699e;
        C14286e c14286e = C14286e.vip;
        synchronized (c14286e) {
            if (!c14286e.ad.containsKey(str)) {
                throw new GeneralSecurityException("Name " + str + " does not exist");
            }
            abstractC12699e = (AbstractC12699e) c14286e.ad.get(str);
        }
        return new C2362e(16, abstractC12699e);
    }

    public static String appmetrica(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final Map license(Map map) {
        int size = map.size();
        if (size == 0) {
            return C9139e.f18290e;
        }
        if (size != 1) {
            return DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) AbstractC13480e.m3573class(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final List metrica(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? DesugarCollections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(AbstractC13480e.m3591interface(list)) : C13664e.f27089e;
    }

    public static final void vip(AppActivity appActivity) {
        C7950e c7950e = appActivity.f36545e;
        c7950e.getClass();
        try {
            try {
                c7950e.ad.metrica(null);
            } catch (ActivityNotFoundException unused) {
                c7950e.vip.metrica(null);
            }
        } catch (ActivityNotFoundException unused2) {
            AbstractC15615e.ad(new C1478e(0, appActivity, "Ошибка при открытии системного проводника.\nУбедитесь, что DocumentsUI не тронут в вашей системе."));
        }
    }
}
